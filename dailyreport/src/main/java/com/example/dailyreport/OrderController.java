package com.example.dailyreport;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/date/{date}")
    public List<Order> getOrdersByDate() {
        return getOrdersByDate(null);
    }

    @GetMapping("/date/{date}")
    public List<Order> getOrdersByDate(@PathVariable String date) {
        return orderService.getOrdersByDate(date);
    }


}
