package com.ctgu.lovelypetplatform;


import com.ctgu.lovelypetplatform.entity.*;
import com.ctgu.lovelypetplatform.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.cs.US_ASCII;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    BrowseRecordService browseRecordService;

    @Autowired
    StarService starService;

    @Autowired
    UserService userService;

    @Autowired
    GoodsService goodsService;

    @Autowired
    LeaveMessageService leaveMessageService;

//    根据telenum查询浏览记录
    @Test
    public void selectBrowseRecordByUserTelenum()
    {
        System.out.println(browseRecordService.selectBrowseRecordByUserTelenum("admin"));
    }

//    根据telenum查询收藏记录
    @Test
    public void selectStarByUserTelenum(){
        System.out.println(starService.selectStarByUserTelenum("admin"));
    }


//    插入查询记录
    @Test
    public void insertBrowseRecord(){
        BrowseRecord browseRecord  = new BrowseRecord();
        browseRecord.setGoodNum(1111);
        browseRecord.setTelenum("admin");
        System.out.println(browseRecordService.insertBrowseRecord(browseRecord));
        System.out.println(browseRecordService.selectBrowseRecordByUserTelenum("admin"));
    }

//    插入收藏记录
    @Test
    public void insertStar(){
        Star star = new Star(null,1111,"admin");
        System.out.println(starService.insertStar(star));
    }

//    插入User
    @Test
    public void insertUser(){
        User user = new User();
        user.setTelenum("1111");
        user.setPassword("1111");
        user.setAddress("湖北省襄阳市谷城县");
        System.out.println(userService.insertUser(user));
    }

    //根据User的telenum或者nickname查询
    @Test
    public void selectUserByTelenum(){
        User user = new User();
        user.setTelenum("1111");
        System.out.println(userService.selectUserByTelenum(user));
    }

//    根据多个条件查询goods
    @Test
    public void selectGoodsByMultipleParameter(){
        Goods goods =new Goods();

        goods.setSummaryClassifyname("书本");
        goods.setDetailClassifyname("计算机类");
        goods.setDescription("字迹");
        System.out.println(goodsService.selectGoodsByMultipleParameter(goods).size());
        for (Goods good: goodsService.selectGoodsByMultipleParameter(goods))
        {
            System.out.println(good);
        }
    }

    @Test
//    根据Goods编号获取留言记录
    public void selectLeaveMessageByGoodsNum()
    {
        for(LeaveMessage leaveMessage : leaveMessageService.selectLeaveMessageByGoodsNum(1))
        {
            System.out.println(leaveMessage);
        }
    }

//    插入留言记录
    @Test
    public void insertLeaveMessage(){
        System.out.println(leaveMessageService.insertLeaveMessage(new LeaveMessage(null,1111,"admin","2020.08.11","这是一条测试数据")));
    }
}
