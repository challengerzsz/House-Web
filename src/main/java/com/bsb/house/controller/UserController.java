package com.bsb.house.controller;

import com.bsb.house.common.model.User;
import com.bsb.house.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zeng on 18-11-27.
 * @version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
