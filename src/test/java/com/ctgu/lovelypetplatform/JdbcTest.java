package com.ctgu.lovelypetplatform;


import com.ctgu.lovelypetplatform.common.OrderinfoDetail;
import com.ctgu.lovelypetplatform.common.ShowOrderinfoDetail;
import com.ctgu.lovelypetplatform.entity.*;
import com.ctgu.lovelypetplatform.service.*;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.cs.US_ASCII;

import java.lang.reflect.Array;
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

    @Autowired
    OrderinfoService orderinfoService;

    //    根据telenum查询浏览记录
    @Test
    public void selectBrowseRecordByUserTelenum() {
        System.out.println(browseRecordService.selectBrowseRecordByUserTelenum("admin"));
    }


    //    插入浏览记录
    @Test
    public void insertBrowseRecord() {
        BrowseRecord browseRecord = new BrowseRecord();
        browseRecord.setGoodNum(1111);
        browseRecord.setTelenum("admin");
        System.out.println(browseRecordService.insertBrowseRecord(browseRecord));
    }

    //    插入收藏记录
    @Test
    public void insertStar() {
        Star star = new Star(null, 1, "admin",null);
        System.out.println(starService.insertStar(star));
    }

    //    插入User
    @Test
    public void insertUser() {
        User user = new User();
        user.setTelenum("1111");
        user.setPassword("1111");
        user.setAddress("湖北省襄阳市谷城县");
        System.out.println(userService.insertUser(user));
    }

    //根据User的telenum或者nickname查询
    @Test
    public void selectUserByMultipleParameter() {
        User user = new User();//使用userid和密码查询
        user.setTelenum("1111");
        user.setPassword("1111");
        User user1 = new User();
        user1.setNickname("敖光成");//使用昵称查询
        User user2 = new User();
        user2.setAddress("湖北");//使用地址查询
        System.out.println(userService.selectUserByMultipleParameter(user));
        System.out.println(userService.selectUserByMultipleParameter(user1));
        System.out.println(userService.selectUserByMultipleParameter(user2));
    }

    //    根据多个条件查询goods
    @Test
    public void selectGoodsByMultipleParameter() {
        Goods goods = new Goods();

        goods.setSummaryClassifyname("书本");
        goods.setDetailClassifyname("计算机类");
        goods.setDescription("字迹");
        System.out.println(goodsService.selectGoodsByMultipleParameter(goods).size());
        for (Goods good : goodsService.selectGoodsByMultipleParameter(goods)) {
            System.out.println(good);
        }
    }

    @Test
//    根据Goods编号获取留言记录
    public void selectLeaveMessageByGoodsNum() {
        for (LeaveMessage leaveMessage : leaveMessageService.selectLeaveMessageByGoodsNum(1)) {
            System.out.println(leaveMessage);
        }
    }

    //    插入留言记录
    @Test
    public void insertLeaveMessage() {
        System.out.println(leaveMessageService.insertLeaveMessage(new LeaveMessage(null, 1111, "admin", "2020.08.11", "这是一条测试数据")));
    }

    //查询浏览记录
    @Test
    public void selectGoodsFromBrowseRecordByTelenum() {

        for (Goods good : browseRecordService.selectGoodsFromBrowseRecordByTelenum("admin")) {
            System.out.println(good);
        }
    }

    //    插入Goods
    @Test
    public void insertGoods() {
        Goods goods = new Goods();
        goods.setOwner("测试1");
        System.out.println(goodsService.insertGoods(goods));
    }

    //    更新Goods
    @Test
    public void updateGoods() {
        Goods goods = new Goods(30, "描述", 1.1, "分类", "fenlei", "pic", "pic", "pic", 1, "测试2", 0, "no");
        System.out.println(goodsService.updateGoods(goods));
    }

    //    更新User
    @Test
    public void updateUser() {
        User user = new User("1111", "1111", "agc", "pic", "nan", "1998", "1.1", "huei");
        System.out.println(userService.updateUser(user));
    }

    //    查询指定用户的收藏记录
    @Test
    public void selectGoodsFromStarByTelenumAndGoodsNum() {
        for (Goods goods : starService.selectGoodsFromStarByTelenumAndGoodsNum("admin")) {
            System.out.println(goods);
        }
    }

    //    插入订单orderinfo
    @Test
    public void insertOrderinfo() {
        Orderinfo orderinfo = new Orderinfo(null, "admin", "2020.08.11", 21, "1111", 1);
        System.out.println(orderinfoService.insertOrderinfo(orderinfo));

    }

    //    更新订单状态
    @Test
    public void updateOrderinfo() {
        Orderinfo orderinfo = new Orderinfo();
        orderinfo.setState(1);
        orderinfo.setOrderid(1);
        System.out.println(orderinfoService.updateOrderinfo(orderinfo));
    }
    @Test
//    多条件的查询收藏
    public void selectStarByMultipleParameter(){
        for (Star star:starService.selectStarByMultipleParameter(new Star(null,1,"admin",null)))
        {
            System.out.println(star);
        }
    }

    @Test
//    订单详情的展示
    public void selectOrderinfo(){
        ShowOrderinfoDetail showOrderinfoDetail = new ShowOrderinfoDetail(orderinfoService,userService,goodsService);
        Orderinfo orderinfo = new Orderinfo();
        orderinfo.setSeller("root");
        System.out.println(showOrderinfoDetail.getOrderinfoDetail(orderinfo).size());

    }
}

