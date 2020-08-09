package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface GoodsService {
    List<Goods> selectAllGoods();
}
