package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAllUser();
    void insertUser(User user);
    List<User> selectUserByMultipleParameter(User user);
    void updateUser(User user);
}
/*
登录--》》》
1.收藏
2.留言
3.购买
4.取消收藏
5.下架
6.上架
7.登录
            第一，未登录---》》   （登录）
用户---》》》
                        -----》》》是自己发布的物品：（留言），（上架）||（下架）
            第二，登录
                        ----》》》不是自己发布的物品：（留言），（购买），（收藏）||（取消收藏）
        */