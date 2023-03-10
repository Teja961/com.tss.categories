package com.tss.categories.dao.extractor;

import com.tss.categories.dao.bo.AccountBo;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AccountExtractor implements ResultSetExtractor<AccountBo> {

    @Override
    public AccountBo extractData(ResultSet rs) throws SQLException, DataAccessException {

        AccountBo accountBo = null;

        while (rs.next()) {

            accountBo = new AccountBo.Builder().withHousehold_account_id(rs.getInt("household_account_id"))
                    .withAccount_id(rs.getInt("account_id"))
                    .withClient_id(rs.getInt("client_id"))
                    .withStatus(rs.getString("status"))
                    .withModified_by(rs.getString("modified_by"))
                    .withModified_dt(rs.getDate("modified_dt"))
                    .withCreated_by(rs.getString("created_by"))
                    .withCreated_dt(rs.getDate("created_dt"))
                    .build();
        }
        return accountBo;
    }
}
