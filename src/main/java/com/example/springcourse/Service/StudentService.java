package com.example.springcourse.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcourse.ExceptionHandler.StudentNotFound;
import com.example.springcourse.Respository.StudentRepository;
import com.example.springcourse.StudentClass.Student;

@Service
public class StudentService {
  @Autowired
  private StudentRepository studentRepository;
  // post method calling
  public Student saveStudent(Student student){
    return studentRepository.save(student);
  }
  // Get method calling
  public List<Student> getAllStudent(){
    return studentRepository.findAll();
  }
  //Put Method Calling
  public Student updateStudent(Long id , Student student){
    Student existingStudent = studentRepository.findById(id).orElseThrow(()->new StudentNotFound("Student not found with id " + id ));
    existingStudent.setName(student.getName());
    existingStudent.setEmail(student.getEmail());
    return studentRepository.save(existingStudent);
  }
  // delete method calling .
  public void deleteStudent(Long id){
    if(!studentRepository.existsById(id)){
        throw new StudentNotFound("Student not found with id " + id);
    }
    studentRepository.deleteById(id);
  }


}
