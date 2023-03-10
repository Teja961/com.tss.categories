package com.tss.categories.model;


import lombok.Data;

import java.util.Date;

@Data
public class UserRequestTo {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;
    private Date dateOfBirth;
    private String gender;
}
