package com.tss.categories.exception;

import com.tss.categories.model.AccountsControllerResTo;
import com.tss.categories.model.CategoriesResponse;
import com.tss.categories.model.StatusBlock;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Component
public class ControllerAdvise {


        @ExceptionHandler(CategoriesInvalidException.class)
        @ResponseBody
        public CategoriesResponse handleCategoriesInvalidException(CategoriesInvalidException categoriesInvalidException){

                CategoriesResponse categoriesResponse= getCategoriesResponse(categoriesInvalidException.getErrorCode(),categoriesInvalidException.getErrorMsg());

                return categoriesResponse;
        }


        @ExceptionHandler(BusinessException.class)
        @ResponseBody
        public CategoriesResponse handleBusinessEception(BusinessException businessException){

             CategoriesResponse categoriesResponse = getCategoriesResponse(businessException.getErrorCode(),businessException.getErrorMsg());

                return categoriesResponse;
        }


        private static CategoriesResponse getCategoriesResponse(String errorCode, String errorMsg) {
                StatusBlock statusBlock = new StatusBlock();
                statusBlock.setErrorCode(errorCode);
                statusBlock.setErrorMsg(errorMsg);
                CategoriesResponse categoriesResponse = new CategoriesResponse();
                categoriesResponse.setStatusBlock(statusBlock);

                return categoriesResponse;
        }

        /*@ExceptionHandler(AcountsRequestInvalidException.class)
        @ResponseBody
        public AccountsControllerResTo handleRequestInvalidException(AcountsRequestInvalidException acountsRequestInvalidException){

               //return AccountsControllerResTo accountsControllerResTo1 = getCategoriesResponse(acountsRequestInvalidException.getErrorCode(), acountsRequestInvalidException.getErrorMessage());
        }*/

}
