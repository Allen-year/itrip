package com.itrip.biz.service.impl;

import com.itrip.biz.service.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceimpl implements HotelService {
    @Autowired
    private HotelMapper hotelmap;



}
