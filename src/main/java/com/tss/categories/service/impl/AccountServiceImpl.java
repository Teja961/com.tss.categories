package com.tss.categories.service.impl;

import com.tss.categories.dao.AccountDaoservice;
import com.tss.categories.dao.bo.AccountBo;
import com.tss.categories.model.*;
import com.tss.categories.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountsService {

    @Autowired
    AccountDaoservice accountDaoservice;

    @Override
    public String saveAccounts(String clientId, AccountsControllerReqTo accountsControllerReqTo) {


        AccountsDaoRequest accountsDaoRequest = new AccountsDaoRequest();
        accountsDaoRequest.setHousehold_account_id(accountsControllerReqTo.getHousehold_account_id());
        accountsDaoRequest.setClient_id(accountsControllerReqTo.getClient_id());
        accountsDaoRequest.setAccount_id(accountsControllerReqTo.getAccount_id());
        accountsDaoRequest.setStatus(accountsControllerReqTo.getStatus());
        accountsDaoRequest.setCreated_by(accountsControllerReqTo.getCreated_by());
        accountsDaoRequest.setCreated_dt(accountsControllerReqTo.getCreated_dt());
        accountsDaoRequest.setModified_by(accountsControllerReqTo.getModified_by());
        accountsDaoRequest.setModified_dt(accountsControllerReqTo.getModified_dt());

        int accountDaoResponse = accountDaoservice.saveAccounts(accountsDaoRequest);

        return "Succefully Inserted";
    }

    @Override
    public AccountsControllerReqTo getAccount(Integer household_account_id) {

        AccountBo accountsDaoRequest = accountDaoservice.getAccount(household_account_id);
        System.out.println("accountsDaoRequest: "+ accountsDaoRequest);

        AccountsControllerReqTo accountsControllerReqTo = new AccountsControllerReqTo();
        System.out.println("accountsControllerReqTo: "+ accountsControllerReqTo);

        accountsControllerReqTo.setHousehold_account_id(accountsDaoRequest.getHousehold_account_id());
        accountsControllerReqTo.setClient_id(accountsDaoRequest.getClient_id());
        accountsControllerReqTo.setAccount_id(accountsDaoRequest.getAccount_id());
        accountsControllerReqTo.setStatus(accountsDaoRequest.getStatus());
        accountsControllerReqTo.setCreated_by(accountsDaoRequest.getCreated_by());
        accountsControllerReqTo.setCreated_dt(accountsDaoRequest.getCreated_dt());
        accountsControllerReqTo.setModified_by(accountsDaoRequest.getModified_by());
        accountsControllerReqTo.setModified_dt(accountsDaoRequest.getModified_dt());

        System.out.println("accountsControllerReqTo1: "+ accountsControllerReqTo);

        return accountsControllerReqTo;
    }

    @Override
    public void deleteAccounts(Integer houseHodlAccountId) {

        accountDaoservice.deleteAccounts(houseHodlAccountId);

    }

    @Override
    public AccountsControllerResTo getAllAccounts(Integer houseHodlAccountId, Integer accountId) {

        AccountsDaoRequest accountsDaoRequest = new AccountsDaoRequest();

        List<AccountBo> accounts = accountDaoservice.getAllAccounts(accountsDaoRequest);

        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setErrorCode("101");
        statusBlock.setErrorMsg("success");

        List<AccountsTo>  accountsList = new ArrayList<>();

        for (AccountBo accountsBo: accountDaoservice.getAllAccounts(accountsDaoRequest)
             ) {
            AccountsTo accountsTo = new AccountsTo();
            accountsTo.setHousehold_account_id(accountsBo.getHousehold_account_id());
            accountsTo.setClient_id(accountsBo.getClient_id());
            accountsTo.setAccount_id(accountsBo.getAccount_id());
            accountsTo.setStatus(accountsBo.getStatus());
            accountsTo.setCreated_dt(accountsBo.getCreated_dt());
            accountsTo.setCreated_by(accountsBo.getCreated_by());
            accountsTo.setModified_dt(accountsBo.getModified_dt());
            accountsTo.setModified_by(accountsBo.getModified_by());

            accountsList.add(accountsTo);
        }

        AccountsControllerResTo accountsControllerResTo = new AccountsControllerResTo();
        accountsControllerResTo.setStatusBlock(statusBlock);
        accountsControllerResTo.setAccounts(accountsList);

        return accountsControllerResTo;
    }


}
