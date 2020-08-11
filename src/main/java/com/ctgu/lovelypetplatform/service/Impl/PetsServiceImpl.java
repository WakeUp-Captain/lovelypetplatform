package com.ctgu.lovelypetplatform.service.Impl;

import com.ctgu.lovelypetplatform.mapper.PetsMapper;
import com.ctgu.lovelypetplatform.po.Pets;
import com.ctgu.lovelypetplatform.service.PetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PetsServiceImpl implements PetsService {
    @Resource
    private PetsMapper petsMapper;
    @Override
    public List<Pets> getPetsList() {
        return petsMapper.getPetList();
    }
}
