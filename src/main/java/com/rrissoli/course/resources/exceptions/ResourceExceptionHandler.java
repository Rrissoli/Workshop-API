package com.rrissoli.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rrissoli.course.services.exceptions.DataBaseException;
import com.rrissoli.course.services.exceptions.ResourceNotFoundExceptions;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundExceptions.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptions  e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status= HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandardError> database(ResourceNotFoundExceptions  e, HttpServletRequest request){
		String error = "Bad Request";
		HttpStatus status= HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
