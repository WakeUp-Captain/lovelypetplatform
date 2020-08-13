package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.common.RetResult;
import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.sql.ResultSet;
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
//    用户登录控制
    @PostMapping("/login")
    public RetResult userLogin(@RequestParam Map<String, Object> reqMap) {
        RetResult retResult = new RetResult();
        User user = new User();
        user.setTelenum(reqMap.get("telenum").toString());
        user.setPassword(reqMap.get("password").toString());
        List<User> users = userService.selectUserByMultipleParameter(user);
        if (users.size() == 0) {
            retResult.setCode(400);
            retResult.setMsg("账号或密码错误");
            retResult.setData(users);
            return retResult;
        } else {
            return (new RetResult(200,"登录成功",users));
        }
    }

//    用户注册控制
    @PostMapping("/register")
    public RetResult userRegister(@RequestParam Map<String,Object> reqMap){
        User user = new User();
        user.setTelenum(reqMap.get("telenum").toString());
        List<User> users = userService.selectUserByMultipleParameter(user);
        user.setNickname(reqMap.get("nickname").toString());
        user.setPassword(reqMap.get("password").toString());
        user.setBirthday(reqMap.get("birthday").toString());
        user.setHeadicon(reqMap.get("headicon").toString());
        user.setAddress(reqMap.get("province").toString() +reqMap.get("city").toString());
        user.setBalance("0");
        user.setSex(reqMap.get("sex").toString());
        if (users.size() != 0) {
            return new RetResult(400,"用户名已被使用",user);
        }else {
            userService.insertUser(user);
            return new RetResult(200,"注册成功",user);
        }
    }

//    用户修改个人信息
    @PostMapping("/update")
    public RetResult userUpdate(@RequestParam Map<String,Object> reqMap)
    {
        User user = new User();
        user.setTelenum(reqMap.get("telenum").toString());
        user.setBalance(userService.selectUserByMultipleParameter(user).get(0).getBalance());
        user.setNickname(reqMap.get("nickname").toString());
        user.setPassword(reqMap.get("password").toString());
        user.setBirthday(reqMap.get("birthday").toString());
        user.setHeadicon(reqMap.get("headicon").toString());
        user.setAddress(reqMap.get("address").toString());
        user.setSex(reqMap.get("sex").toString());
        return new RetResult(200,"修改成功",userService.updateUser(user));
    }

//    用户充值余额
    @PostMapping("/recharge")
    public RetResult rechargeBalance(@RequestParam Map<String,Object> reqMap){
        User user = new User();
        user.setTelenum(reqMap.get("telenum").toString());
        user = userService.selectUserByMultipleParameter(user).get(0);
//        （原来的余额转double+重置的余额转double）最后转字符串
        user.setBalance((String.valueOf(Double.parseDouble(reqMap.get("recharge").toString()) +Double.parseDouble(user.getBalance()))));
        userService.updateUser(user);
        return new RetResult(200,"重置后的余额为:"+user.getBalance(),user);
    }
}

