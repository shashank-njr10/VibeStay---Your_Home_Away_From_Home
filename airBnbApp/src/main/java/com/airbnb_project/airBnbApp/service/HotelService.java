package com.airbnb_project.airBnbApp.service;

import com.airbnb_project.airBnbApp.dto.HotelDto;
import com.airbnb_project.airBnbApp.entity.Hotel;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
    HotelDto updateHotelById(Long id, HotelDto hotelDto);

   void  deleteHotelById(Long id);
}
