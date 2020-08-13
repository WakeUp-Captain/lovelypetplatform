package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.BrowseHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrowseHistoryMapper {
    List<BrowseHistory> getBrowseHistory(@Param("telenum") String telenum);
    int deleteByPrimaryKey(@Param("recordid") Integer recordid);
}
