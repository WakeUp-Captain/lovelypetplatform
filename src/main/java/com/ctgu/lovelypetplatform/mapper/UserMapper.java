package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAllUser();
    void insertUser(User user);
    List<User> selectUserByTelenum(User user);
}
