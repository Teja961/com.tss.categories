package com.tss.categories.dao;

import com.tss.categories.dao.bo.AccountBo;
import com.tss.categories.model.AccountsDaoRequest;

import java.util.List;

public interface AccountDaoservice {
    int saveAccounts(AccountsDaoRequest accountsDaoRequest);

    AccountBo getAccount(Integer household_account_id);

    void deleteAccounts(Integer houseHodlAccountId);

    List<AccountBo> getAllAccounts(AccountsDaoRequest accountsDaoRequest);
}
