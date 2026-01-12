package com.example.springcourse.StudentClass;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
  private int rollno;
  private String name ;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id ;
  private String email ;
  // Getter
  public int getRollNo(){
    return rollno ;
  }
  public String getName(){
    return name ;
  }
  public String getEmail(){
    return email;
  }
  public Long  getId(){
    return id ;
  }
  //Setter
 public void setRollNo(int rollno){
    this.rollno = rollno;
 }
 public void setName(String name){
  this.name = name ;
 }
 public void setEmail(String email){
  this.email = email;
 }


}
