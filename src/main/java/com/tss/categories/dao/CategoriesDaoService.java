package com.tss.categories.dao;


import com.tss.categories.model.CategoriesDaoRequest;
import com.tss.categories.model.CategoriesDaoResponse;
import com.tss.categories.model.TejaDaoRequest;
import com.tss.categories.model.TejaDaoResponse;

public interface CategoriesDaoService {
    CategoriesDaoResponse getAllcategories(CategoriesDaoRequest categoriesDaoRequest);


    CategoriesDaoResponse getCategoriesById(String clientId);

    TejaDaoResponse getTejaDaoDetails(TejaDaoRequest tejaDaoRequest);
}
