package com.tss.categories.dao.extractor;


import com.tss.categories.dao.bo.AccountBo;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountExtractorListTo implements ResultSetExtractor<List<AccountBo>> {

    List<AccountBo> accountBos = new ArrayList<>();

    @Override
    public List<AccountBo> extractData(ResultSet rs) throws SQLException, DataAccessException {

        while (rs.next()){
            AccountBo accountBo = new AccountBo();
            accountBo.setHousehold_account_id(rs.getInt("household_account_id"));
            accountBo.setClient_id(rs.getInt("client_id"));
            accountBo.setAccount_id(rs.getInt("account_id"));
            accountBo.setStatus(rs.getString("status"));
            accountBo.setCreated_by(rs.getString("created_by"));
            accountBo.setCreated_dt(rs.getDate("created_dt"));
            accountBo.setModified_by(rs.getString("modified_by"));
            accountBo.setModified_dt(rs.getDate("modified_dt"));

            accountBos.add(accountBo);
        }

        return accountBos;
    }
}
