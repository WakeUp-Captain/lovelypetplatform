package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.Orderinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderinfoMapper {
    void insertOrderinfo(Orderinfo orderinfo);
    void updateOrderinfo(Orderinfo orderinfo);
}
