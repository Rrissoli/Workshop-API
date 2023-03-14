package com.rrissoli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrissoli.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
