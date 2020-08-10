package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.config.RetResult;
import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.service.GoodsService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@CrossOrigin
@RequestMapping("/goods")
@ResponseBody
@Controller
public class GoodsCon {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/list")
    public RetResult selectAllGoods(){
        RetResult retResult =new RetResult(200,"获取数据成功",goodsService.selectAllGoods());
        return retResult;
    }

    @PostMapping("/addGoods")
    public Goods addGoods(@RequestParam Map<String,Object> reqMap){
        String name = reqMap.get("name").toString();
        String region = reqMap.get("region").toString();

        System.out.println(name);
        System.out.println(region);
        return goodsService.selectAllGoods().get(0);
    }
}
