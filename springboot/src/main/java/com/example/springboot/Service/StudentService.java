package com.example.springboot.Service;

import com.example.springboot.model.Student;

public interface StudentService {

    Student getById(int id);

    Student getByName(String name);

    boolean save(Student student);
}
