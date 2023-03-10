package com.tss.categories.model;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AccountsControllerReqTo {

    private Integer household_account_id;
    private Integer client_id;
    private Integer account_id;
    private String status;
    private Date created_dt;
    private String created_by;
    private Date modified_dt;
    private String modified_by;
}