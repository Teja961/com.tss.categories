package com.tss.categories.validator;

import com.tss.categories.exception.AcountsRequestInvalidException;
import com.tss.categories.model.AccountsControllerReqTo;
import org.springframework.stereotype.Component;

@Component
public class AccountsValidator {
    public void accountsRequest(String clientId, AccountsControllerReqTo accountsControllerReqTo) {

        throw new AcountsRequestInvalidException("101", "Requested data is not valid");

    }
}
