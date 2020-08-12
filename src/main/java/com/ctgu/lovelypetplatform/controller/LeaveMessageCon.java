package com.ctgu.lovelypetplatform.controller;


import com.ctgu.lovelypetplatform.common.RetResult;
import com.ctgu.lovelypetplatform.entity.LeaveMessage;
import com.ctgu.lovelypetplatform.service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ResponseBody
@Controller
@RequestMapping("/leaveMessage")
public class LeaveMessageCon {

    @Autowired
    LeaveMessageService leaveMessageService;

//    在商品详情页根据商品的id查看所有用户的留言
    @PostMapping("/getMassage")
    public RetResult selectAllLeaveMessage(@RequestParam Map<String, Object> reqMap){
        List<LeaveMessage> leaveMessages = leaveMessageService.selectLeaveMessageByGoodsNum(Integer.parseInt(reqMap.get("good_num").toString()));
        return new RetResult(200,"查询留言成功",leaveMessages);
    }

//    发布留言，需要前端的参数为：用户id，商品id，发布留言的内容，需要自己生成发布留言的时间
    @PostMapping("/insertMassage")
    public RetResult insertMassage(@RequestParam Map<String, Object> reqMap){
        LeaveMessage leaveMessage = new LeaveMessage();
        leaveMessage.setGoodNum(Integer.parseInt(reqMap.get("good_num").toString()));
        leaveMessage.setMessage(reqMap.get("leaveMassage").toString());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        leaveMessage.setDate(df.format(new Date()).toString());
        leaveMessage.setTelenum(reqMap.get("telenum").toString());
        leaveMessageService.insertLeaveMessage(leaveMessage);
        return new RetResult(200,"",leaveMessage);
    }
}
