package com.tss.categories.dao;

import com.tss.categories.model.UserRequestTo;

public interface UserDaoService {
    int saveUserDetails(UserRequestTo userRequestTo);
}
