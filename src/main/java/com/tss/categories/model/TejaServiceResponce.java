package com.tss.categories.model;

import lombok.Data;

import java.util.List;

@Data
public class TejaServiceResponce {

    private StatusBlock statusBlock;
    private List<TejaServiceResponseDetails> tejaServiceResponseDetailsList;
}
