package com.vehicles.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	
	protected ResponseEntity<Object> hendleException(BaseException exception, WebRequest request){
		
		return ResponseEntity.status(exception.getStatus()).body(exception.getMessage());
		
	}
}
