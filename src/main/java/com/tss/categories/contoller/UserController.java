package com.tss.categories.contoller;


import com.tss.categories.model.UserRequestTo;
import com.tss.categories.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuserdetails")
    public void saveUserDetails(@RequestBody UserRequestTo userRequestTo){

       int statusBlock = userService.saveUserDetails(userRequestTo);
}
}
