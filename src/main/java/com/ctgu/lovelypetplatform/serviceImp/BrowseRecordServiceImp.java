package com.ctgu.lovelypetplatform.serviceImp;

import com.ctgu.lovelypetplatform.entity.BrowseRecord;
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
        browseRecordMapper.insertBrowseRecord(browseRecord);
        return browseRecord;
    }
}
