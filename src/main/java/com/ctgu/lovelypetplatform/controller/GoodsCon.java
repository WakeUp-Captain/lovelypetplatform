package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@CrossOrigin
@RequestMapping("/goods")
@ResponseBody
@Controller
public class GoodsCon {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/list")
    public List<Goods> selectAllGoods(){
        return goodsService.selectAllGoods();
    }
}
