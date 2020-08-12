package com.ctgu.lovelypetplatform.controller;

import com.ctgu.lovelypetplatform.entity.Pets;
import com.ctgu.lovelypetplatform.service.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    private PetsService petsService;
    @RequestMapping("/list")
    public List<Pets> getPetsList(){
        return petsService.getPetsList();
    }
}
