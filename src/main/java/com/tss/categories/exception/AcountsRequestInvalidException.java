package com.tss.categories.exception;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class AcountsRequestInvalidException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public AcountsRequestInvalidException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
