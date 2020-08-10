package com.ctgu.lovelypetplatform.service;


import com.ctgu.lovelypetplatform.entity.BrowseRecord;

import java.util.List;

public interface BrowseRecordService {
    List<BrowseRecord> selectBrowseRecordByUserTelenum(String telenum);
    BrowseRecord insertBrowseRecord(BrowseRecord browseRecord);
}
