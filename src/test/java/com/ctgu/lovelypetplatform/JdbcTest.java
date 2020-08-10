package com.ctgu.lovelypetplatform;


import com.ctgu.lovelypetplatform.entity.BrowseRecord;
import com.ctgu.lovelypetplatform.service.BrowseRecordService;
import com.ctgu.lovelypetplatform.service.StarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    BrowseRecordService browseRecordService;

    @Autowired
    StarService starService;

    @Autowired


//    根据telenum查询浏览记录
    @Test
    public void selectBrowseRecordByUserTelenum()
    {
        System.out.println(browseRecordService.selectBrowseRecordByUserTelenum("admin"));
    }

//    根据telenum查询收藏记录
    @Test
    public void selectStarByUserTelenum(){
        System.out.println(starService.selectStarByUserTelenum("admin"));
    }


//    插入查询记录
    @Test
    public void insertBrowseRecord(){
        BrowseRecord browseRecord  = new BrowseRecord();
        browseRecord.setGoodNum(1111);
        browseRecord.setTelenum("admin");
        System.out.println(browseRecordService.insertBrowseRecord(browseRecord));
        System.out.println(browseRecordService.selectBrowseRecordByUserTelenum("admin"));
    }
}
