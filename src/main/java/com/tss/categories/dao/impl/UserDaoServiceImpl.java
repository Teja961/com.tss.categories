package com.tss.categories.dao.impl;

import com.tss.categories.dao.UserDaoService;
import com.tss.categories.enums.PortableDBtable;
import com.tss.categories.model.UserRequestTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoServiceImpl implements UserDaoService {


    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private static final String INSERT_INTO = "insert into ";

    @Override
    public int saveUserDetails(UserRequestTo userRequestTo) {

        String sql = INSERT_INTO + PortableDBtable.USER_DETAILS.getTableName() + " (user_id, firstname, lastname, mobile_number, email_id, date_of_birth, gender) "
        + " values (:user_id, :firstname, :lastname, :mobile_number, :email_id, :date_of_birth, :gender)";

        System.out.println("SQL: "+ sql);

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("user_id", userRequestTo.getUserId());
        mapSqlParameterSource.addValue("firstname", userRequestTo.getFirstName());
        mapSqlParameterSource.addValue("lastname", userRequestTo.getLastName());
        mapSqlParameterSource.addValue("mobile_number", userRequestTo.getMobileNumber());
        mapSqlParameterSource.addValue("email_id", userRequestTo.getEmailId());
        mapSqlParameterSource.addValue("date_of_birth", userRequestTo.getDateOfBirth());
        mapSqlParameterSource.addValue("gender", userRequestTo.getGender());

        return namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
    }
}
