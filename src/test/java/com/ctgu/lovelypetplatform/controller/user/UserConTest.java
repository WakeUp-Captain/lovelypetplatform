package com.ctgu.lovelypetplatform.controller.user;

import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserConTest {

    @Autowired
    private UserService userService;

    @Test
    void listAllUser() {
        System.out.println(userService.selectAllUser());
    }
}