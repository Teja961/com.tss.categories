package com.tss.categories.dao.impl;


import com.tss.categories.dao.CategoriesDaoService;
import com.tss.categories.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoriesDaoServiceImpl implements CategoriesDaoService {
    @Override
    public CategoriesDaoResponse getAllcategories(CategoriesDaoRequest categoriesDaoRequest) {


        List<CategoriesDaoDetails> categoriesDaoListDetails = new ArrayList<>();

        CategoriesDaoDetails categoriesDao1 = new CategoriesDaoDetails();
        categoriesDao1.setId("111");
        categoriesDao1.setName("electronics");
        categoriesDao1.setType("ele");
        categoriesDao1.setStatus("active");
        CategoriesDaoDetails categoriesDao2 = new CategoriesDaoDetails();
        categoriesDao2.setId("111");
        categoriesDao2.setName("electronics");
        categoriesDao2.setType("ele");
        categoriesDao2.setStatus("active");
        CategoriesDaoDetails categoriesDao3 = new CategoriesDaoDetails();
        categoriesDao3.setId("111");
        categoriesDao3.setName("electronics");
        categoriesDao3.setType("ele");
        categoriesDao3.setStatus("active");
        CategoriesDaoDetails categoriesDao4 = new CategoriesDaoDetails();
        categoriesDao4.setId("111");
        categoriesDao4.setName("electronics");
        categoriesDao4.setType("ele");
        categoriesDao4.setStatus("active");
        CategoriesDaoDetails categoriesDao5 = new CategoriesDaoDetails();
        categoriesDao5.setId("111");
        categoriesDao5.setName("electronics");
        categoriesDao5.setType("ele");
        categoriesDao5.setStatus("active");
        CategoriesDaoDetails categoriesDao6 = new CategoriesDaoDetails();
        categoriesDao6.setId("111");
        categoriesDao6.setName("electronics");
        categoriesDao6.setType("ele");
        categoriesDao6.setStatus("active");
        CategoriesDaoDetails categoriesDao7 = new CategoriesDaoDetails();
        categoriesDao7.setId("111");
        categoriesDao7.setName("electronics");
        categoriesDao7.setType("ele");
        categoriesDao7.setStatus("active");
        CategoriesDaoDetails categoriesDao8 = new CategoriesDaoDetails();
        categoriesDao8.setId("111");
        categoriesDao8.setName("electronics");
        categoriesDao8.setType("ele");
        categoriesDao8.setStatus("active");
        CategoriesDaoDetails categoriesDao9 = new CategoriesDaoDetails();
        categoriesDao9.setId("111");
        categoriesDao9.setName("electronics");
        categoriesDao9.setType("ele");
        categoriesDao9.setStatus("active");
        CategoriesDaoDetails categoriesDao10 = new CategoriesDaoDetails();
        categoriesDao10.setId("111");
        categoriesDao10.setName("electronics");
        categoriesDao10.setType("ele");
        categoriesDao10.setStatus("active");
        CategoriesDaoDetails categoriesDao11 = new CategoriesDaoDetails();
        categoriesDao11.setId("111");
        categoriesDao11.setName("electronics");
        categoriesDao11.setType("ele");
        categoriesDao11.setStatus("active");

        categoriesDaoListDetails.add(categoriesDao1);
        categoriesDaoListDetails.add(categoriesDao2);
        categoriesDaoListDetails.add(categoriesDao3);
        categoriesDaoListDetails.add(categoriesDao4);
        categoriesDaoListDetails.add(categoriesDao5);
        categoriesDaoListDetails.add(categoriesDao6);
        categoriesDaoListDetails.add(categoriesDao7);
        categoriesDaoListDetails.add(categoriesDao8);
        categoriesDaoListDetails.add(categoriesDao9);
        categoriesDaoListDetails.add(categoriesDao10);
        categoriesDaoListDetails.add(categoriesDao11);

        CategoriesDaoResponse categoriesDaoResponse = new CategoriesDaoResponse();

        categoriesDaoResponse.setCategoriesDaoDetailsList(categoriesDaoListDetails);
        categoriesDaoResponse.setErrorCode("0");
        categoriesDaoResponse.setErrorMsg("success");

        return categoriesDaoResponse;
    }

    @Override
    public CategoriesDaoResponse getCategoriesById(String clientId) {


        List<CategoriesDaoDetails> categoriesDaoListDetails = new ArrayList<>();

        CategoriesDaoDetails categoriesDao1 = new CategoriesDaoDetails();
        categoriesDao1.setId("111");
        categoriesDao1.setName("electronics");
        categoriesDao1.setType("ele");
        categoriesDao1.setStatus("active");
        CategoriesDaoDetails categoriesDao2 = new CategoriesDaoDetails();
        categoriesDao2.setId("111");
        categoriesDao2.setName("electronics");
        categoriesDao2.setType("ele");
        categoriesDao2.setStatus("active");
        CategoriesDaoDetails categoriesDao3 = new CategoriesDaoDetails();
        categoriesDao3.setId("111");
        categoriesDao3.setName("electronics");
        categoriesDao3.setType("ele");
        categoriesDao3.setStatus("active");
        CategoriesDaoDetails categoriesDao4 = new CategoriesDaoDetails();
        categoriesDao4.setId("111");
        categoriesDao4.setName("electronics");
        categoriesDao4.setType("ele");
        categoriesDao4.setStatus("active");
        CategoriesDaoDetails categoriesDao5 = new CategoriesDaoDetails();
        categoriesDao5.setId("111");
        categoriesDao5.setName("electronics");
        categoriesDao5.setType("ele");
        categoriesDao5.setStatus("active");
        CategoriesDaoDetails categoriesDao6 = new CategoriesDaoDetails();
        categoriesDao6.setId("111");
        categoriesDao6.setName("electronics");
        categoriesDao6.setType("ele");
        categoriesDao6.setStatus("active");
        CategoriesDaoDetails categoriesDao7 = new CategoriesDaoDetails();
        categoriesDao7.setId("111");
        categoriesDao7.setName("electronics");
        categoriesDao7.setType("ele");
        categoriesDao7.setStatus("active");
        CategoriesDaoDetails categoriesDao8 = new CategoriesDaoDetails();
        categoriesDao8.setId("111");
        categoriesDao8.setName("electronics");
        categoriesDao8.setType("ele");
        categoriesDao8.setStatus("active");
        CategoriesDaoDetails categoriesDao9 = new CategoriesDaoDetails();
        categoriesDao9.setId("111");
        categoriesDao9.setName("electronics");
        categoriesDao9.setType("ele");
        categoriesDao9.setStatus("active");
        CategoriesDaoDetails categoriesDao10 = new CategoriesDaoDetails();
        categoriesDao10.setId("111");
        categoriesDao10.setName("electronics");
        categoriesDao10.setType("ele");
        categoriesDao10.setStatus("active");
        CategoriesDaoDetails categoriesDao11 = new CategoriesDaoDetails();
        categoriesDao11.setId("111");
        categoriesDao11.setName("electronics");
        categoriesDao11.setType("ele");
        categoriesDao11.setStatus("active");

        categoriesDaoListDetails.add(categoriesDao1);
        categoriesDaoListDetails.add(categoriesDao2);
        categoriesDaoListDetails.add(categoriesDao3);
        categoriesDaoListDetails.add(categoriesDao4);
        categoriesDaoListDetails.add(categoriesDao5);
        categoriesDaoListDetails.add(categoriesDao6);
        categoriesDaoListDetails.add(categoriesDao7);
        categoriesDaoListDetails.add(categoriesDao8);
        categoriesDaoListDetails.add(categoriesDao9);
        categoriesDaoListDetails.add(categoriesDao10);
        categoriesDaoListDetails.add(categoriesDao11);

        CategoriesDaoResponse categoriesDaoResponse = new CategoriesDaoResponse();

        categoriesDaoResponse.setCategoriesDaoDetailsList(categoriesDaoListDetails);
        categoriesDaoResponse.setErrorCode("0");
        categoriesDaoResponse.setErrorMsg("success");

        return categoriesDaoResponse;
    }

    @Override
    public TejaDaoResponse getTejaDaoDetails(TejaDaoRequest tejaDaoRequest) {

        List<TejaDaoResonseDetails> tejaDaoResonseDetails = new ArrayList<>();

        TejaDaoResponse tejaDaoResponse = new TejaDaoResponse();

        TejaDaoResonseDetails tejaDbResponseDetails1 = new TejaDaoResonseDetails();
        tejaDbResponseDetails1.setId("1");
        tejaDbResponseDetails1.setFirstName("Teja");
        tejaDbResponseDetails1.setLastName("Talupula");
        tejaDbResponseDetails1.setDob("18th Jan 95");
        tejaDbResponseDetails1.setOccupation("Software");
        tejaDbResponseDetails1.setMobileNumber("9100228227");
        tejaDbResponseDetails1.setLocation("Hyd");

        TejaDaoResonseDetails tejaDbResponseDetails2 = new TejaDaoResonseDetails();
        tejaDbResponseDetails2.setId("1");
        tejaDbResponseDetails2.setFirstName("Munna");
        tejaDbResponseDetails2.setLastName("Talupula");
        tejaDbResponseDetails2.setDob("21st Jan 95");
        tejaDbResponseDetails2.setOccupation("Software");
        tejaDbResponseDetails2.setMobileNumber("9100228227");
        tejaDbResponseDetails2.setLocation("Hyd");


        tejaDaoResonseDetails.add(tejaDbResponseDetails1);
        tejaDaoResonseDetails.add(tejaDbResponseDetails2);

        tejaDaoResponse.setErrorCode("101");
        tejaDaoResponse.setErrorMsg("success");
        tejaDaoResponse.setTejaDaoResonseDetails(tejaDaoResonseDetails);

        return tejaDaoResponse;


    }

    public static class AccountDaoServiceImpl {
    }
}
