package com.tss.categories.contoller;

import com.tss.categories.model.AccountsControllerReqTo;
import com.tss.categories.model.AccountsControllerResTo;
import com.tss.categories.model.AccountsTo;
import com.tss.categories.service.AccountsService;
import com.tss.categories.validator.AccountsValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    AccountsService accountsDaoService;

    @Autowired
    private AccountsValidator accountsValidator;


    @PostMapping("/saveaccounts")
    public ResponseEntity<String> saveAccounts(@RequestHeader("client_id") String clientId,
                                              @RequestBody AccountsControllerReqTo accountsControllerReqTo){


       accountsValidator.accountsRequest(clientId, accountsControllerReqTo);
       String data = String.valueOf(accountsDaoService.saveAccounts(clientId, accountsControllerReqTo));
       return ResponseEntity.status(HttpStatus.CREATED.value()).body(data);
    }

    @GetMapping("/getaccounts")
    public AccountsControllerReqTo getAccounts(@RequestParam("household_account_id") Integer household_account_id){

       return accountsDaoService.getAccount(household_account_id);
    }

    @DeleteMapping("/deleteaccounts")
    public ResponseEntity<String> deleteAccounts(@RequestParam("household_account_id") Integer houseHodlAccountId){
        accountsDaoService.deleteAccounts(houseHodlAccountId);
        return ResponseEntity.status(HttpStatus.OK).body("deleted the record successfully");
    }

    @GetMapping("/getallaccounts")
    public AccountsControllerResTo getAllAccounts(@RequestHeader("household_account_id") Integer houseHodlAccountId,
                                                  @RequestHeader("client_id") Integer accountId){


     return accountsDaoService.getAllAccounts(houseHodlAccountId, accountId);

    }

}
