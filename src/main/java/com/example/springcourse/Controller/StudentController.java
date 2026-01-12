package com.example.springcourse.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springcourse.Service.StudentService;
import com.example.springcourse.StudentClass.Student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class StudentController {
    @Autowired
    private StudentService studentService ;

  @PostMapping("/students")
  public Student createStudent(@RequestBody Student student){
    return studentService.saveStudent(student);
  }
  @GetMapping
  public List<Student> getStudents() {
      return studentService.getAllStudent();
  }
  @PutMapping("students/{id}")
  public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student newStudent) {
    Student updated = studentService.updateStudent(id,newStudent);
    return ResponseEntity.ok(updated);
  }
  @DeleteMapping("students/{id}")
  public ResponseEntity<String> deleteStudent(@PathVariable Long id){
    studentService.deleteStudent(id);
    return ResponseEntity.ok("Student deleted");
  }

  



}
