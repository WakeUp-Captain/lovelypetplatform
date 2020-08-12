package com.ctgu.lovelypetplatform.serviceImp;

import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.mapper.GoodsMapepr;
import com.ctgu.lovelypetplatform.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {
    @Resource
    GoodsMapepr goodsMapepr;

    @Override
    public List<Goods> selectAllGoods(){
        return goodsMapepr.selectAllGoods();
    }

    @Override
    public List<Goods> selectGoodsByMultipleParameter(Goods goods) {
        return goodsMapepr.selectGoodsByMultipleParameter(goods);
    }

    @Override
    public Goods insertGoods(Goods goods) {
        goodsMapepr.insertGoods(goods);
        return goods;
    }

    @Override
    public Goods updateGoods(Goods goods) {
        goodsMapepr.updateGoods(goods);
        return goods;
    }
}
