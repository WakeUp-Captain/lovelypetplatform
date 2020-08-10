package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.BrowseRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrowseRecordMapper {
    List<BrowseRecord> selectBrowseRecordByUserTelenum(String telenum);
    void insertBrowseRecord(BrowseRecord browseRecord);
}
