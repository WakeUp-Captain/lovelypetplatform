package com.ctgu.lovelypetplatform.serviceImp;

import com.ctgu.lovelypetplatform.entity.BrowseRecord;
import com.ctgu.lovelypetplatform.entity.Goods;
import com.ctgu.lovelypetplatform.mapper.BrowseRecordMapper;
import com.ctgu.lovelypetplatform.service.BrowseRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrowseRecordServiceImp implements BrowseRecordService {
    @Resource
    BrowseRecordMapper browseRecordMapper;

    @Override
    public List<BrowseRecord> selectBrowseRecordByUserTelenum(String telenum) {
        return browseRecordMapper.selectBrowseRecordByUserTelenum(telenum);
    }

    @Override
    public BrowseRecord insertBrowseRecord(BrowseRecord browseRecord) {
        if (browseRecordMapper.selectGoodsFromBrowseRecordByTelenumAndGoodsNum(browseRecord).size() == 0) {
            System.out.println("没有记录，可以再次插入数据");
            browseRecordMapper.insertBrowseRecord(browseRecord);
        }
        return browseRecord;
    }

    @Override
    public List<Goods> selectGoodsFromBrowseRecordByTelenum(String telenum) {
        return browseRecordMapper.selectGoodsFromBrowseRecordByTelenum(telenum);
    }

    @Override
    public List<BrowseRecord> selectGoodsFromBrowseRecordByTelenumAndGoodsNum(BrowseRecord browseRecord) {
        return browseRecordMapper.selectGoodsFromBrowseRecordByTelenumAndGoodsNum(browseRecord);
    }
}
