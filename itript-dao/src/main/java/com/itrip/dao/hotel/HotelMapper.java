package com.itrip.dao.hotel;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelMapper {
    /**
     * 根据城市Id，分页查询城市信息
     */
     List<Hotel> getHotellistByCityid(@Param("cityId")int cityId,
                                      @Param("from")int from,
                                      @Param("pageSize")int pageSize);

     int getHotelCountByCityId(@Param("cityId")int cityId);
}
