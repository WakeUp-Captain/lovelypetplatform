package com.ctgu.lovelypetplatform.serviceImp;

import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.mapper.UserMapper;
import com.ctgu.lovelypetplatform.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    @Override
    public List<User> selectUserByTelenum(User user) {
        return userMapper.selectUserByTelenum(user);
    }
}
