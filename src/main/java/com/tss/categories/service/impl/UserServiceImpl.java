package com.tss.categories.service.impl;

import com.tss.categories.dao.UserDaoService;
import com.tss.categories.model.UserRequestTo;
import com.tss.categories.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public int saveUserDetails(UserRequestTo userRequestTo) {


       int userDaoResponse = userDaoService.saveUserDetails(userRequestTo);


        return userDaoResponse;
    }
}
