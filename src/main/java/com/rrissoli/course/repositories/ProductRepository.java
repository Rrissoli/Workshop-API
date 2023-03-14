package com.rrissoli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrissoli.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
