package com.example.springcourse.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springcourse.StudentClass.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
