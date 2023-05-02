package com.example.springboot.ServiceImpl;

import com.example.springboot.Service.StudentService;
import com.example.springboot.StudentRepository.StudentRepository;
import com.example.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Student getById(int id) {
        Student s = studentRepository.findById(id).orElse(null);
        return s;
    }
    @Override
    public Student getByName(String name) {
        Student student = studentRepository.findByName(name);
        return student;
    }
    @Override
    public boolean save(Student student) {
//        System.out.println("id- " + student.getId() + ", name-" + student.getName() + ", phoneNumber-" + student.getPhoneNumber());
        studentRepository.save(student);
        return true;
    }
}
