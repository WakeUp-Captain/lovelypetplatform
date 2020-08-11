package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/user")
public class UserCon {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> listAllUser() {
        List<User> users = userService.selectAllUser();
        return users;
    }

    @PostMapping("/login")
    public String userLogin(@RequestParam Map<String, Object> reqMap) {
        User user = new User();
        user.setTelenum(reqMap.get("telenum").toString());
        user.setPassword(reqMap.get("password").toString());
        return "登录成功";
    }


}
