package com.example.springcourse.Respository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.springcourse.ExceptionHandler.StudentNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {

  public ResponseEntity<String> handleStudentNotFound(
    StudentNotFound ex
  ){
    return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
  }
  

}
