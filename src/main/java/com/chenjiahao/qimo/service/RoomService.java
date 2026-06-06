package com.chenjiahao.qimo.service;

import com.chenjiahao.qimo.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> findAll();
    void save(Room room);
    void delete(Long id);
    void updateStatus(Long id, String status);
}
