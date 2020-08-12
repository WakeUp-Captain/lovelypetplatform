package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.po.BrowseHistory;

import java.util.List;

public interface BrowseHistoryService {
    List<BrowseHistory> getBrowseHistory(String telenum);
    int deleteByPrimaryKey(int recordid);
}
