package com.ctgu.lovelypetplatform.controller.goods;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class GoodsConTest {

    @Autowired
     private GoodsService goodsService;

    @Test
    void selectAllGoods() {
        System.out.println(goodsService.selectAllGoods());
    }
}