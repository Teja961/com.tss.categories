package com.tss.categories.exception;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategoriesInvalidException extends RuntimeException {

    private String errorCode;
    private String errorMsg;

    public CategoriesInvalidException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
