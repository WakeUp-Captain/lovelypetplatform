package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Orderinfo;
import com.sun.tools.corba.se.idl.constExpr.Or;

public interface OrderinfoService {
    Orderinfo insertOrderinfo(Orderinfo orderinfo);
    Orderinfo updateOrderinfo(Orderinfo orderinfo);
}
