package com.tss.categories.service.impl;

import com.tss.categories.dao.CategoriesDaoService;
import com.tss.categories.model.*;
import com.tss.categories.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesDaoService categoriesDaoService;

    @Override
    public CategoriesResponse getAllCategories(String cedNum, String clentId, String channelId, String reqId, String messageTs) {


        CategoriesDaoRequest categoriesDaoRequest = new CategoriesDaoRequest();
        categoriesDaoRequest.setCardnum(cedNum);
        categoriesDaoRequest.setCleintId(channelId);
        categoriesDaoRequest.setChannelId(channelId);

        CategoriesDaoResponse categoriesDaoResponse = categoriesDaoService.getAllcategories(categoriesDaoRequest);

        CategoriesResponse categoriesResponse = new CategoriesResponse();

        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setErrorMsg(categoriesDaoResponse.getErrorMsg());
        statusBlock.setErrorCode(categoriesDaoResponse.getErrorMsg());


        List<CategoriesServiceDetails> categoriesServiceDetailsList = new ArrayList<>();

        for (CategoriesDaoDetails categoriesDaoDetails : categoriesDaoResponse.getCategoriesDaoDetailsList()
             ) {
            CategoriesServiceDetails categoriesServiceDetails = new CategoriesServiceDetails();
            categoriesServiceDetails.setId(categoriesDaoDetails.getId());
            categoriesServiceDetails.setName(categoriesDaoDetails.getName());
            categoriesServiceDetails.setType(categoriesDaoDetails.getType());
            categoriesServiceDetails.setStatus(categoriesDaoDetails.getStatus());
            categoriesServiceDetailsList.add(categoriesServiceDetails);
        }

        categoriesResponse.setStatusBlock(statusBlock);
        categoriesResponse.setCategoriesServiceDetails(categoriesServiceDetailsList);

        return categoriesResponse;
    }

    @Override
    public CategoriesResponse getCategoriesById(String clientId) {

        CategoriesResponse categoriesResponse = new CategoriesResponse();
        CategoriesDaoResponse categoriesDaoResponse = categoriesDaoService.getCategoriesById(clientId);

        System.out.println("categoriesDaoResponse: "+ categoriesDaoResponse);

        List<CategoriesServiceDetails> categoriesServiceDetailsList = new ArrayList<>();

        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setErrorCode(categoriesDaoResponse.getErrorCode());
        statusBlock.setErrorMsg(categoriesDaoResponse.getErrorMsg());

        for (CategoriesDaoDetails categoriesDaoDetails : categoriesDaoResponse.getCategoriesDaoDetailsList()
             ) {
            CategoriesServiceDetails categoriesServiceDetails = new CategoriesServiceDetails();

            categoriesServiceDetails.setId(categoriesDaoDetails.getId());
            categoriesServiceDetails.setName(categoriesDaoDetails.getName());
            categoriesServiceDetails.setType(categoriesDaoDetails.getType());
            categoriesServiceDetails.setStatus(categoriesDaoDetails.getStatus());
            categoriesServiceDetailsList.add(categoriesServiceDetails);
             }

        categoriesResponse.setStatusBlock(statusBlock);
        categoriesResponse.setCategoriesServiceDetails(categoriesServiceDetailsList);

        System.out.println("categoriesResponse"+ categoriesResponse);
        System.out.println("categoriesResponse"+ categoriesResponse);

        return categoriesResponse;
    }

    @Override
    public String createCategory(Categories categories) {

        return null;
    }

    @Override
    public TejaServiceResponce getTejaDetails(TejaServiceRequest tejaServiceRequest) {

        TejaDaoRequest tejaDaoRequest = new TejaDaoRequest();
        tejaDaoRequest.setId(tejaServiceRequest.getId());
        tejaDaoRequest.setFirstName(tejaServiceRequest.getFirstName());
        tejaDaoRequest.setLastName(tejaServiceRequest.getLastName());
        tejaDaoRequest.setMobileNumber(tejaServiceRequest.getMobileNumber());

        TejaDaoResponse tejaDaoResponse = categoriesDaoService.getTejaDaoDetails(tejaDaoRequest);

        TejaServiceResponce tejaServiceResponce = new TejaServiceResponce();

        List<TejaServiceResponseDetails> tejaServiceResponseDetailsList = new ArrayList<>();

        for ( TejaDaoResonseDetails tejaServiceResponseDetails: tejaDaoResponse.getTejaDaoResonseDetails()
             ) {
            TejaServiceResponseDetails tejaServiceResponseDetails1 = new TejaServiceResponseDetails();
            tejaServiceResponseDetails1.setId(tejaServiceResponseDetails.getId());
            tejaServiceResponseDetails1.setFirstName(tejaServiceResponseDetails.getFirstName());
            tejaServiceResponseDetails1.setLastName(tejaServiceResponseDetails.getLastName());
            tejaServiceResponseDetails1.setDob(tejaServiceResponseDetails.getDob());
            tejaServiceResponseDetails1.setOccupation(tejaServiceResponseDetails.getOccupation());
            tejaServiceResponseDetails1.setLocation(tejaServiceResponseDetails.getLocation());
            tejaServiceResponseDetails1.setMobileNumber(tejaServiceResponseDetails.getMobileNumber());

            tejaServiceResponseDetailsList.add(tejaServiceResponseDetails1);
        }

        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setErrorMsg(tejaDaoResponse.getErrorMsg());
        statusBlock.setErrorCode(tejaDaoResponse.getErrorCode());

        tejaServiceResponce.setStatusBlock(statusBlock);
        tejaServiceResponce.setTejaServiceResponseDetailsList(tejaServiceResponseDetailsList);

        return tejaServiceResponce;
    }
}
