package com.ctgu.lovelypetplatform.common;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.entity.Orderinfo;
import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.GoodsService;
import com.ctgu.lovelypetplatform.service.OrderinfoService;
import com.ctgu.lovelypetplatform.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShowOrderinfoDetail {
    @Autowired
    OrderinfoService orderinfoService;

    @Autowired
    UserService userService;

    @Autowired
    GoodsService goodsService;

    public List<OrderinfoDetail> getOrderinfoDetail(Orderinfo orderinfo)
    {
        List<OrderinfoDetail> orderinfoDetails = new ArrayList<>();

        for (Orderinfo item : this.orderinfoService.selectOrderinfo(orderinfo))
        {
//            需要查询的用户
            User user = new User();
//            作为卖家
            user.setTelenum(item.getBuyer());
//            查询到买家的信息
            User buyer = userService.selectUserByMultipleParameter(user).get(0);
            user.setTelenum(null);
//            作为卖家
            user.setTelenum(item.getSeller());
//            查询到卖家的信息
            User seller = userService.selectUserByMultipleParameter(user).get(0);

            Goods good = new Goods();
            good.setGoodNum(item.getGoodNum());
//            查询到商品信息
            Goods goods = goodsService.selectGoodsByMultipleParameter(good).get(0);
            OrderinfoDetail orderinfoDetail = new OrderinfoDetail(item.getOrderid(),item.getBuyer(),buyer.getNickname(),buyer.getHeadicon(),item.getSeller(),seller.getNickname(),seller.getHeadicon(),item.getGoodNum(),goods.getDetailClassifyname(),goods.getPic1(),goods.getDescription(),item.getDate(),item.getState());
            orderinfoDetails.add(orderinfoDetail);
        }
        return orderinfoDetails;
    }
}
