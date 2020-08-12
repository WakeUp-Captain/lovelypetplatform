package com.ctgu.lovelypetplatform.mapper;

import com.ctgu.lovelypetplatform.entity.Pets;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetsMapper {
    List<Pets> getPetList();
}
