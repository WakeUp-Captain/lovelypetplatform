package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/user")
public class UserCon {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> listAllUser(){
        List<User> users = userService.selectAllUser();
        return users;
    }
}
