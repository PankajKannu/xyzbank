package com.mybank.mybankapp.error;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mybank.mybankapp.dto.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorMessage> noSuchElementFoundException(NoSuchElementException e,WebRequest request) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setStatus(HttpStatus.NOT_FOUND);
		errorMessage.setMessage(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorMessage> illegalArgumentException(IllegalArgumentException e,WebRequest request) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setStatus(HttpStatus.NOT_FOUND);
		errorMessage.setMessage(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	
	
}
