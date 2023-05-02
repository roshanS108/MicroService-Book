package com.example.springboot.StudentRepository;

import com.example.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByName(String name);
}
