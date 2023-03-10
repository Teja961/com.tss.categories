package com.tss.categories.validator;

import com.tss.categories.exception.BusinessException;
import com.tss.categories.exception.CategoriesInvalidException;
import com.tss.categories.model.CategoriesResponse;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class CategoriesValidator {
    public void validateCategoriesRequest(String cedNum, String clentId, String channelId, String reqId, String messageTs) throws CategoriesInvalidException {

        if (cedNum == null && StringUtils.isEmpty(cedNum)){

            throw new CategoriesInvalidException("C101", "cedNum is null");
        }

    }
    public void validateCategoriesResponse(CategoriesResponse categoriesResponse) {

        if (categoriesResponse == null && ObjectUtils.isEmpty(categoriesResponse)){
            throw new BusinessException("201", "Categories Resonse is empty");
        }

    }
}
