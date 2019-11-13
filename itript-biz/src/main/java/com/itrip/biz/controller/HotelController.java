package com.itrip.biz.controller;

import com.itript.beans.dao.Dto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @RequestMapping("")
    public Dto getPagedHotels(@RequestParam("cityId")int cityId){

        return null;
    }
}
