package com.ctgu.lovelypetplatform.controller;

import com.ctgu.lovelypetplatform.config.AjaxResult;
import com.ctgu.lovelypetplatform.entity.Order;
import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/bought", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult getBoughtList(@RequestBody User user){
        System.out.println("success");
        List<Order> boughtOrder=orderService.getBoughtOrder(user.getNickname());
        System.out.println(user.getNickname());
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(boughtOrder);
        return ajaxResult;
    }
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult test(@RequestBody User user){
        System.out.println("success");
        List<Order> boughtOrder=orderService.getBoughtOrder(user.getNickname());
        System.out.println(user.getNickname());
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(boughtOrder);
        return ajaxResult;
    }
    @RequestMapping(value = "/sold", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult getSoldList(@RequestBody User user){
        System.out.println("success");
        List<Order> soldOrder=orderService.getSoldOrder(user.getNickname());
        System.out.println(user.getNickname());
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(soldOrder);
        return ajaxResult;
    }
    @RequestMapping(value = "/deleteBought", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult deleteBought(@RequestBody Order order){
        System.out.println("success");
        int result=orderService.deleteByPrimaryKey(order.getOrderid());
//        System.out.println(user.getNickname());
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }
}
