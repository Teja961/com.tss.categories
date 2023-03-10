package com.tss.categories.service;

import com.tss.categories.model.AccountsControllerReqTo;
import com.tss.categories.model.AccountsControllerResTo;

public interface AccountsService {
    String saveAccounts(String clientId, AccountsControllerReqTo accountsControllerReqTo);

    AccountsControllerReqTo getAccount(Integer household_account_id);

    void deleteAccounts(Integer houseHodlAccountId);

    AccountsControllerResTo getAllAccounts(Integer houseHodlAccountId, Integer accountId);
}
