package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getBoughtOrder(String buyername);
    List<Order> getSoldOrder(String sellername);
    int deleteByPrimaryKey(Integer orderid);
}
