package com.rrissoli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrissoli.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
