package com.ctgu.lovelypetplatform.serviceImp;


import com.ctgu.lovelypetplatform.entity.Orderinfo;
import com.ctgu.lovelypetplatform.mapper.OrderinfoMapper;
import com.ctgu.lovelypetplatform.service.OrderinfoService;
//import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderinfoServiceImp implements OrderinfoService {
    @Resource
    OrderinfoMapper orderinfoMapper;

    @Override
    public Orderinfo insertOrderinfo(Orderinfo orderinfo) {
        orderinfoMapper.insertOrderinfo(orderinfo);
        return orderinfo;
    }

    @Override
    public Orderinfo updateOrderinfo(Orderinfo orderinfo) {
        orderinfoMapper.updateOrderinfo(orderinfo);
        return orderinfo;
    }

    @Override
    public List<Orderinfo> selectOrderinfo(Orderinfo orderinfo) {
        return orderinfoMapper.selectOrderinfo(orderinfo);
    }
}
