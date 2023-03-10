package com.tss.categories.service;

import com.tss.categories.model.*;

public interface CategoriesService {


    CategoriesResponse getAllCategories(String cedNum, String clentId, String channelId, String reqId, String messageTs);

    CategoriesResponse getCategoriesById(String clientId);

    String createCategory(Categories categories);

    TejaServiceResponce getTejaDetails(TejaServiceRequest tejaServiceRequest);
}
