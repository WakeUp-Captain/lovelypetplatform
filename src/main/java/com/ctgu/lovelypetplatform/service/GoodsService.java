package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface GoodsService {
    List<Goods> selectAllGoods();
    List<Goods> selectGoodsByMultipleParameter(Goods goods);
    Goods insertGoods(Goods goods);
    Goods updateGoods(Goods goods);
}
