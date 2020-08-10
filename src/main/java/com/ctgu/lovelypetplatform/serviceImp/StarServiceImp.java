package com.ctgu.lovelypetplatform.serviceImp;


import com.ctgu.lovelypetplatform.entity.Star;
import com.ctgu.lovelypetplatform.mapper.StarMapper;
import com.ctgu.lovelypetplatform.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StarServiceImp implements StarService {
    @Resource
    StarMapper starMapper;

    @Override
    public List<Star> selectStarByUserTelenum(String telenum) {
        return starMapper.selectStarByUserTelenum(telenum);
    }
}
