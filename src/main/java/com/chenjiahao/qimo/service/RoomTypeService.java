package com.chenjiahao.qimo.service;

import com.chenjiahao.qimo.entity.RoomType;

import java.time.LocalDate;
import java.util.List;

public interface RoomTypeService {
    List<RoomType> findAll();
    List<RoomType> findAvailable(LocalDate checkinDate, LocalDate checkoutDate, String category, String keyword, String sort, Integer minPrice, Integer maxPrice);
    RoomType findById(Long id);
    void save(RoomType roomType);
    void delete(Long id);
    void updateStatus(Long id, Integer status);
}
