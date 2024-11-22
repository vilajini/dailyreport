package com.example.dailyreport;



import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
     List<Order> findByOrderDate(String orderDate);
}
