package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.entity.Star;

import java.util.List;

public interface StarService {
    List<Star> selectStarByUserTelenum(String telenum);
    Star insertStar(Star star);
    List<Goods> selectGoodsFromStarByTelenumAndGoodsNum(String telenum);
}
