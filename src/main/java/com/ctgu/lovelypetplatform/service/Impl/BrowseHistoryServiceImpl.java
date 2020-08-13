package com.ctgu.lovelypetplatform.service.Impl;

import com.ctgu.lovelypetplatform.mapper.BrowseHistoryMapper;
import com.ctgu.lovelypetplatform.entity.BrowseHistory;
import com.ctgu.lovelypetplatform.service.BrowseHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrowseHistoryServiceImpl implements BrowseHistoryService {
    @Resource
    private BrowseHistoryMapper browseHistoryMapper;
    @Override
    public List<BrowseHistory> getBrowseHistory(String telenum) {
        return browseHistoryMapper.getBrowseHistory(telenum);
    }

    @Override
    public int deleteByPrimaryKey(int recordid) {
        return browseHistoryMapper.deleteByPrimaryKey(recordid);
    }
}
