package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.Star;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StarMapper {
    List<Star> selectStarByUserTelenum(String telenum);
    void insertStar(Star star);
}
