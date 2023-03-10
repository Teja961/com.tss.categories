package com.tss.categories.contoller;


import com.tss.categories.exception.CategoriesInvalidException;
import com.tss.categories.model.*;
import com.tss.categories.service.CategoriesService;
import com.tss.categories.validator.CategoriesValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class CategoriesController {

    @Autowired
    CategoriesValidator categoriesValidator;

    @Autowired
    CategoriesService categoriesService;


    @ResponseBody
    @GetMapping("/categories/{crdNum}")
    public CategoriesResponse getAllCategories(@PathVariable("crdNum") String cedNum,
                                        @RequestHeader("cleint_id") String clentId,
                                        @RequestHeader("channel_id") String channelId,
                                        @RequestHeader("request_id") String reqId,
                                        @RequestHeader("message_ts") String messageTs,
                                        @RequestHeader("auth_tocken") String authTocken) throws CategoriesInvalidException {


        categoriesValidator.validateCategoriesRequest(cedNum, clentId, channelId, reqId, messageTs);

        CategoriesResponse categoriesResponse = categoriesService.getAllCategories(cedNum, clentId, channelId, reqId, messageTs);

        categoriesValidator.validateCategoriesResponse(categoriesResponse);

        return categoriesResponse;
    }

    @GetMapping("/categorie/{clientId}")
    @ResponseBody
    public ResponseEntity<CategoriesResponse> getCategoriesById(@PathVariable("clientId") String clientId ){

       CategoriesResponse categoriesResponse = categoriesService.getCategoriesById(clientId);

       return ResponseEntity.status(HttpStatus.ACCEPTED).body(categoriesResponse);

    }

    @PostMapping("createcategory")
    public ResponseEntity<Categories> createCategory(@RequestBody Categories categories){

      String response = categoriesService.createCategory(categories);

      return ResponseEntity.status(HttpStatus.CREATED).body(categories);

    }

    @GetMapping("/getTejaDetails")
    public TejaServiceResponce getTejaData(@RequestBody TejaServiceRequest tejaServiceRequest){

        TejaServiceResponce tejaServiceResponce = null;
        if(!(tejaServiceRequest.getId() == null) && !StringUtils.isEmpty(tejaServiceRequest.getId()) && !tejaServiceRequest.getId().isBlank()) {
             tejaServiceResponce = categoriesService.getTejaDetails(tejaServiceRequest);
            return tejaServiceResponce;
        }

        return tejaServiceResponce;
    }

}
