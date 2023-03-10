package com.tss.categories.model;

import lombok.Data;

import java.util.List;

@Data
public class CategoriesResponse {

        private StatusBlock statusBlock;
        private List<CategoriesServiceDetails> categoriesServiceDetails;

}
