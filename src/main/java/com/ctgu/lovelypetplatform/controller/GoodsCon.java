package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.common.RetResult;
import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.service.GoodsService;
import com.sun.javadoc.SeeTag;
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
    public RetResult selectAllGoods() {
        RetResult retResult = new RetResult(200, "获取数据成功", goodsService.selectAllGoods());
        return retResult;
    }


    //    添加物品
    @PostMapping("/addGoods")
    public RetResult addGoods(@RequestParam Map<String, Object> reqMap) {
        Goods goods = new Goods(
                null,
                reqMap.get("description").toString(),
                Integer.parseInt(reqMap.get("price").toString()),
                reqMap.get("summaryClassifyname").toString(),
                reqMap.get("detailClassifyname").toString(),
                reqMap.get("pic1").toString(),
                reqMap.get("pic2").toString(),
                reqMap.get("pic3").toString(),
                1,
                reqMap.get("owner").toString(),
                0,
                null
        );
        goodsService.insertGoods(goods);
        return new RetResult(200, "添加物品成功", goods);
    }

    //    修改物品信息
    @RequestMapping("updateGoods")
    public RetResult updateGoods(@RequestParam Map<String, Object> reqMap) {
        Goods  goods = new Goods(
                Integer.parseInt(reqMap.get("good_num").toString()),
                reqMap.get("description").toString(),
                Integer.parseInt(reqMap.get("price").toString()),
                reqMap.get("summaryClassifyname").toString(),
                reqMap.get("detailClassifyname").toString(),
                reqMap.get("pic1").toString(),
                reqMap.get("pic2").toString(),
                reqMap.get("pic3").toString(),
                1,//不修改
                null,//不修改
                0,//不修改
                null//不修改
        );
        goodsService.updateGoods(goods);
        return new RetResult(200,"修改成功",goods);
    }

//    根据分类1，分类2和物品描述查询物品
    @PostMapping("/goodsQuery")
    public RetResult goodsQuery(@RequestParam Map<String, Object> reqMap) {
        Goods goods = new Goods();
        goods.setSummaryClassifyname(reqMap.get("summary_classifyname").toString());
        goods.setDetailClassifyname(reqMap.get("detail_classifyname").toString());
        goods.setDescription(reqMap.get("description").toString());
        List<Goods> goodsList = goodsService.selectGoodsByMultipleParameter(goods);
        return new RetResult(200, "查询成功", goodsList);
    }

//    进入商品详情页
    @PostMapping("/detailGoods")
    public RetResult detailGoods(@RequestParam Map<String, Object> reqMap)
    {
        Goods goods = new Goods();
        System.out.println(Integer.parseInt(reqMap.get("goodnum").toString()));
        goods.setGoodNum(Integer.parseInt(reqMap.get("goodnum").toString()));

        return new RetResult(200,"进入详情页",goodsService.selectGoodsByMultipleParameter(goods));
    }
}

