package com.example.dailyreport;

import com.example.dailyreport.Order;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByDate(String date) {
        return orderRepository.findByOrderDate(date);
    }
}
