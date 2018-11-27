package com.bsb.house.controller;

import com.bsb.house.common.model.User;
import com.bsb.house.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zeng on 18-11-27.
 * @version 1.0
 */
@Controller
public class HelloController {


    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap) {
        List<User> users = userService.getUsers();
        User user = users.get(0);
        modelMap.put("user", user);
        return "Hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "homepage/index";
    }
}
