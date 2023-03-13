package com.rrissoli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrissoli.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
