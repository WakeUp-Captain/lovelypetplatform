package com.ctgu.lovelypetplatform.service;

import com.ctgu.lovelypetplatform.entity.LeaveMessage;

import java.util.List;

public interface LeaveMessageService {
    List<LeaveMessage> selectLeaveMessageByGoodsNum(int goodNum);
    LeaveMessage insertLeaveMessage(LeaveMessage leaveMessage);

}
