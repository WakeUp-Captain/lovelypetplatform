package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.entity.Star;

import java.util.List;

public interface StarService {
    List<Star> selectStarByMultipleParameter(Star star);
    Star insertStar(Star star);
    List<Goods> selectGoodsFromStarByTelenumAndGoodsNum(String telenum);
    List<Star> getStarsByTelenum(String telenum);
    int deleteByPrimaryKey(int starid);
}
