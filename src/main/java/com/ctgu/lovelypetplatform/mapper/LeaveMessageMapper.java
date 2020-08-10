package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.LeaveMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveMessageMapper {
    List<LeaveMessage> selectLeaveMessageByGoodsNum(int goodNum);
    void insertLeaveMessage(LeaveMessage leaveMessage);
}
