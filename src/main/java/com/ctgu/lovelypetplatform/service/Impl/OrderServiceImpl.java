package com.ctgu.lovelypetplatform.service.Impl;

import com.ctgu.lovelypetplatform.mapper.OrderMapper;
import com.ctgu.lovelypetplatform.po.Order;
import com.ctgu.lovelypetplatform.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public List<Order> getBoughtOrder(String buyername) {
        return orderMapper.getBoughtOrder(buyername);
    }

    @Override
    public List<Order> getSoldOrder(String sellername) {
        return orderMapper.getSoldOrder(sellername);
    }
}
