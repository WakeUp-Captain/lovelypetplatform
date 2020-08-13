package com.ctgu.lovelypetplatform.controller;

import com.ctgu.lovelypetplatform.common.RetResult;
import com.ctgu.lovelypetplatform.entity.Star;
import com.ctgu.lovelypetplatform.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@ResponseBody
@Controller
@RequestMapping("/star")
public class StarCon {

    @Autowired
    StarService starService;

    @PostMapping("/insertStar")
    public RetResult insertStar(@RequestParam Map<String, Object> reqMap){
        Star star = new Star(null,Integer.parseInt(reqMap.get("goodnum").toString()),reqMap.get("telenum").toString(),null);
        starService.insertStar(star);
        System.out.println(star);
        return new RetResult(200,"收藏成功",star);
    }
}
