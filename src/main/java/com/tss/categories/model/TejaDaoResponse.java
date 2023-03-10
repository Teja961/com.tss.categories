package com.tss.categories.model;

import lombok.Data;

import java.util.List;

@Data
public class TejaDaoResponse {

    private String errorCode;
    private String errorMsg;
    private List<TejaDaoResonseDetails> tejaDaoResonseDetails;

}
