package service;

import entity.Order;
import org.springframework.stereotype.Service;
import repository.OrderRepository;

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
