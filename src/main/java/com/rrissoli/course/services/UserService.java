package com.rrissoli.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rrissoli.course.entities.User;
import com.rrissoli.course.repositories.UserRepository;
import com.rrissoli.course.services.exceptions.DataBaseException;
import com.rrissoli.course.services.exceptions.ResourceNotFoundExceptions;

import jakarta.persistence.EntityNotFoundException;


@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundExceptions(id));
	}
	public User Insert(User obj) {
		return repository.save(obj);
	}
	public void Delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundExceptions(id);
			
		}catch (DataBaseException e) {
			throw new DataBaseException(e.getMessage());
		}
		
	}
	public User update ( Long id, User obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundExceptions(id);
		}
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
