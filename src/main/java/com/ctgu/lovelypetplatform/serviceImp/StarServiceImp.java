package com.ctgu.lovelypetplatform.serviceImp;


import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.entity.Star;
import com.ctgu.lovelypetplatform.mapper.StarMapper;
import com.ctgu.lovelypetplatform.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StarServiceImp implements StarService {
    @Resource
    StarMapper starMapper;

    @Override
    public List<Star> selectStarByMultipleParameter(Star star) {
        return starMapper.selectStarByMultipleParameter(star);
    }

    @Override
    public Star insertStar(Star star) {
        starMapper.insertStar(star);
        return star;
    }

    @Override
    public List<Goods> selectGoodsFromStarByTelenumAndGoodsNum(String telenum) {
        return starMapper.selectGoodsFromStarByTelenumAndGoodsNum(telenum);
    }
}
