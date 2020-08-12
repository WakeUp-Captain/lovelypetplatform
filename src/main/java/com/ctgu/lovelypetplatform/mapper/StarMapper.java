package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.entity.Star;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StarMapper {
    List<Star> selectStarByMultipleParameter(Star star);
    void insertStar(Star star);
    List<Goods> selectGoodsFromStarByTelenumAndGoodsNum(String telenum);
    List<Star> selectStarListByTelenum(String telenum);
    int deleteByPrimaryKey(Integer starid);
}
