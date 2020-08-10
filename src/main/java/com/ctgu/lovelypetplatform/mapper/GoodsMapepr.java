package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapepr {
    List<Goods> selectAllGoods();
    List<Goods> selectGoodsByMultipleParameter(Goods goods);
}
