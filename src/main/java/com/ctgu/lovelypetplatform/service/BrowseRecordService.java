package com.ctgu.lovelypetplatform.service;


import com.ctgu.lovelypetplatform.entity.BrowseRecord;
import com.ctgu.lovelypetplatform.entity.Goods;

import java.util.List;

public interface BrowseRecordService {
//    根据用户的主键获取浏览信息记录
    List<BrowseRecord> selectBrowseRecordByUserTelenum(String telenum);
    BrowseRecord insertBrowseRecord(BrowseRecord browseRecord);
    List<Goods> selectGoodsFromBrowseRecordByTelenum(String telenum);
    List<BrowseRecord> selectGoodsFromBrowseRecordByTelenumAndGoodsNum(BrowseRecord browseRecord);
}
