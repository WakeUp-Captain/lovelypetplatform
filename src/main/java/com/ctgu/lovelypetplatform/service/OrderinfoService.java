package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Orderinfo;
//import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.List;

public interface OrderinfoService {
    Orderinfo insertOrderinfo(Orderinfo orderinfo);
    Orderinfo updateOrderinfo(Orderinfo orderinfo);
    List<Orderinfo> selectOrderinfo(Orderinfo orderinfo);
}
