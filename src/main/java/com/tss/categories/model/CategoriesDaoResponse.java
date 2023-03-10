package com.tss.categories.model;


import lombok.Data;

import java.util.List;

@Data
public class CategoriesDaoResponse {

    private String errorCode;
    private String errorMsg;
    private List<CategoriesDaoDetails> categoriesDaoDetailsList;

}
