package com.example.springcourse.ExceptionHandler;

public class StudentNotFound  extends RuntimeException{
    public StudentNotFound(String message){
       super(message);
    }
}
