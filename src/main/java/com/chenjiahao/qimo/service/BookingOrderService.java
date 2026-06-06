package com.chenjiahao.qimo.service;

import com.chenjiahao.qimo.entity.BookingOrder;
import com.chenjiahao.qimo.entity.User;

import java.util.List;

public interface BookingOrderService {
    boolean create(BookingOrder order, User user);
    List<BookingOrder> findByUser(Long userId);
    List<BookingOrder> search(String keyword, String status);
    BookingOrder findById(Long id);
    void cancel(Long id);
    boolean checkIn(Long id);
    void checkOut(Long id);
}
