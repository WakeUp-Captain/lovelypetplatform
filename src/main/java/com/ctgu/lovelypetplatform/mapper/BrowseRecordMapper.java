package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.BrowseRecord;
import com.ctgu.lovelypetplatform.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrowseRecordMapper {

    List<BrowseRecord> selectBrowseRecordByUserTelenum(String telenum);
    void insertBrowseRecord(BrowseRecord browseRecord);
    List<Goods> selectGoodsFromBrowseRecordByTelenum(String telenum);
    List<BrowseRecord> selectGoodsFromBrowseRecordByTelenumAndGoodsNum(BrowseRecord browseRecord);
}
