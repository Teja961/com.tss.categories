package com.tss.categories.model;

import lombok.Data;

import java.util.List;

@Data
public class AccountsControllerResTo {

    private StatusBlock statusBlock;
    private List<AccountsTo> accounts;


}
