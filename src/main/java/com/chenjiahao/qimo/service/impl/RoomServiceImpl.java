package com.chenjiahao.qimo.service.impl;

import com.chenjiahao.qimo.entity.Room;
import com.chenjiahao.qimo.mapper.RoomMapper;
import com.chenjiahao.qimo.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;

    public List<Room> findAll() {
        return roomMapper.findAll();
    }

    public void save(Room room) {
        if (room.getId() == null) {
            roomMapper.insert(room);
        } else {
            roomMapper.update(room);
        }
    }

    public void delete(Long id) {
        roomMapper.delete(id);
    }

    public void updateStatus(Long id, String status) {
        roomMapper.updateStatus(id, status);
    }
}
