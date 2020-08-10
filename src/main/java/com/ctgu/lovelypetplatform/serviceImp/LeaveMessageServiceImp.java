package com.ctgu.lovelypetplatform.serviceImp;

import com.ctgu.lovelypetplatform.entity.LeaveMessage;
import com.ctgu.lovelypetplatform.mapper.LeaveMessageMapper;
import com.ctgu.lovelypetplatform.service.LeaveMessageService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveMessageServiceImp implements LeaveMessageService {
    @Resource
    LeaveMessageMapper leaveMessageMapper;

    @Override
    public List<LeaveMessage> selectLeaveMessageByGoodsNum(int goodNum) {
        return leaveMessageMapper.selectLeaveMessageByGoodsNum(goodNum);
    }

    @Override
    public LeaveMessage insertLeaveMessage(LeaveMessage leaveMessage) {
        leaveMessageMapper.insertLeaveMessage(leaveMessage);
        return leaveMessage;
    }
}
