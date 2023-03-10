package com.tss.categories.dao.impl;

import com.tss.categories.dao.AccountDaoservice;
import com.tss.categories.dao.bo.AccountBo;
import com.tss.categories.dao.extractor.AccountExtractor;
import com.tss.categories.dao.extractor.AccountExtractorListTo;
import com.tss.categories.enums.PortableDBtable;
import com.tss.categories.model.AccountsDaoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoServiceImpl implements AccountDaoservice {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private AccountExtractor accountExtractor;

    @Autowired
    private AccountExtractorListTo accountExtractorListTo;

    private static final String DELETE_FROM = "DELETE from";

    @Override
    public int saveAccounts(AccountsDaoRequest accountsDaoRequest) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

        mapSqlParameterSource.addValue("household_account_id", accountsDaoRequest.getHousehold_account_id());
        mapSqlParameterSource.addValue("client_id", accountsDaoRequest.getClient_id());
        mapSqlParameterSource.addValue("account_id", accountsDaoRequest.getAccount_id());
        mapSqlParameterSource.addValue("status", accountsDaoRequest.getStatus());
        mapSqlParameterSource.addValue("created_dt", accountsDaoRequest.getCreated_dt());
        mapSqlParameterSource.addValue("created_by", accountsDaoRequest.getCreated_by());
        mapSqlParameterSource.addValue("modified_dt", accountsDaoRequest.getModified_dt());
        mapSqlParameterSource.addValue("modified_by", accountsDaoRequest.getModified_by());


        String sql = "INSERT INTO "+PortableDBtable.HOUSEHOLD_ACCOUNT_ACCESS.getTableName()+ "(household_account_id, client_id, account_id, status, created_dt, created_by, modified_dt, modified_by) "
                + "VALUES (:household_account_id, :client_id, :account_id, :status, :created_dt, :created_by, :modified_dt, :modified_by)";
        System.out.println(sql);
        return namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
    }

    @Override
    public AccountBo getAccount(Integer household_account_id) {

        String sql = "select * from " + PortableDBtable.HOUSEHOLD_ACCOUNT_ACCESS.getTableName() + " where household_account_id = :household_account_id ";
        System.out.println("SQL"+sql);
        return namedParameterJdbcTemplate.query(sql,new MapSqlParameterSource("household_account_id",household_account_id), accountExtractor);

    }

    @Override
    public void deleteAccounts(Integer houseHodlAccountId) {
        System.out.println("houseHodlAccountId: "+ houseHodlAccountId);
        String sql = DELETE_FROM + PortableDBtable.HOUSEHOLD_ACCOUNT_ACCESS.getTableName() + " where household_account_id =:houseHodlAccountId";
        System.out.println("Delete SQL: " +sql);
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource("houseHodlAccountId",houseHodlAccountId ));
    }

    @Override
    public List<AccountBo> getAllAccounts(AccountsDaoRequest accountsDaoRequest) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

        mapSqlParameterSource.addValue("household_account_id", accountsDaoRequest.getHousehold_account_id());
        mapSqlParameterSource.addValue("client_id", accountsDaoRequest.getClient_id());
        mapSqlParameterSource.addValue("account_id", accountsDaoRequest.getAccount_id());
        mapSqlParameterSource.addValue("status", accountsDaoRequest.getStatus());
        mapSqlParameterSource.addValue("created_dt", accountsDaoRequest.getCreated_dt());
        mapSqlParameterSource.addValue("created_by", accountsDaoRequest.getCreated_by());
        mapSqlParameterSource.addValue("modified_dt", accountsDaoRequest.getModified_dt());
        mapSqlParameterSource.addValue("modified_by", accountsDaoRequest.getModified_by());

        String sql = "select * from " + PortableDBtable.HOUSEHOLD_ACCOUNT_ACCESS.getTableName();

        return namedParameterJdbcTemplate.query(sql, mapSqlParameterSource, accountExtractorListTo);
    }
}
