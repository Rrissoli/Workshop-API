package com.rrissoli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrissoli.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
