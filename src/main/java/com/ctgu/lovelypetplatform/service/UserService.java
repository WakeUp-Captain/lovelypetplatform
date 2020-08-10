package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.User;


import java.util.List;

public interface UserService {
    List<User> selectAllUser();
    User insertUser(User user);
    List<User> selectUserByTelenum(User user);
}