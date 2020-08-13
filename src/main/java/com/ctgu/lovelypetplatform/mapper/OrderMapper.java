package com.ctgu.lovelypetplatform.mapper;
import com.ctgu.lovelypetplatform.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderMapper {
    List<Order> getBoughtOrder(@Param("buyername") String buyername);
    List<Order> getSoldOrder(@Param("sellername") String sellername);
    int deleteByPrimaryKey(@Param("orderid") Integer orderid);
}
