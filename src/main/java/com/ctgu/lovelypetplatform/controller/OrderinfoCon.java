package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.common.RetResult;
import com.ctgu.lovelypetplatform.entity.Orderinfo;
import com.ctgu.lovelypetplatform.service.OrderinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/order")
public class OrderinfoCon {
    @Autowired
    OrderinfoService orderinfoService;

    private String date;
    @PostMapping("/insertOrderinfo")
    public RetResult insertOrderinfo(@RequestParam Map<String, Object> reqMap){
        Orderinfo orderinfo = new Orderinfo();
        orderinfo.setBuyer(reqMap.get("telenum").toString());
        orderinfo.setGoodNum(Integer.parseInt(reqMap.get("goodnum").toString()));
//        orderinfo.setSeller(reqMap.get("seller").toString());
        orderinfo.setState(1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        orderinfo.setDate(df.format(new Date()).toString());
        orderinfoService.insertOrderinfo(orderinfo);
        return new RetResult(200,"成功生成订单",orderinfo);
    }
}
