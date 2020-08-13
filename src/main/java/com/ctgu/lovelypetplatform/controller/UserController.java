package com.ctgu.lovelypetplatform.controller;

import com.ctgu.lovelypetplatform.config.AjaxResult;
import com.ctgu.lovelypetplatform.entity.BrowseHistory;
import com.ctgu.lovelypetplatform.entity.Star;
import com.ctgu.lovelypetplatform.entity.User;
import com.ctgu.lovelypetplatform.service.BrowseHistoryService;
import com.ctgu.lovelypetplatform.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private BrowseHistoryService browseHistoryService;
    @Autowired
    private StarService starService;

    @RequestMapping(value = "/browsehistory", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult getBrowseHistory(@RequestBody User user){
        System.out.println("success");
        List<BrowseHistory> browseHistoryList=browseHistoryService.getBrowseHistory(user.getTelenum());
        System.out.println(user.getNickname());
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData(browseHistoryList);
        return ajaxResult;
    }

    @RequestMapping(value = "/deletebrowsehistory", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult deleteBrowseHistory(@RequestBody BrowseHistory browseHistory){
        System.out.println("success");
        int result =browseHistoryService.deleteByPrimaryKey(browseHistory.getRecordid());
        System.out.println(result);
        AjaxResult ajaxResult = new AjaxResult();
        if(result!=1){
            ajaxResult.setSuccess(false);
        }
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    @RequestMapping(value = "/starlist", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult getStarList(@RequestBody User user){
        System.out.println("success");
        List<Star> starList =starService.getStarsByTelenum(user.getTelenum());
        System.out.println(starList);
        AjaxResult ajaxResult = new AjaxResult();
        if(starList.size()==0){
            ajaxResult.setSuccess(false);
        }
        ajaxResult.setSuccess(true);
        ajaxResult.setData(starList);
        return ajaxResult;
    }
    @RequestMapping(value = "/deleteStar", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult deleteStar(@RequestBody Star star){
        System.out.println("success");
        int result =starService.deleteByPrimaryKey(star.getStarid());
        System.out.println(result);
        AjaxResult ajaxResult = new AjaxResult();
        if(result!=1){
            ajaxResult.setSuccess(false);
        }
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }


}
