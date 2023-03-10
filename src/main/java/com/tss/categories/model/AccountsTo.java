package com.tss.categories.model;

import lombok.Data;

import java.util.Date;

@Data
public class AccountsTo {
    private Integer household_account_id;
    private Integer client_id;
    private Integer account_id;
    private String status;
    private Date created_dt;
    private String created_by;
    private Date modified_dt;
    private String modified_by;
}
