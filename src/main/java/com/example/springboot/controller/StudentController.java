package com.example.springboot.controller;
import com.example.springboot.Service.StudentService;
import com.example.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/id")
    public Student getById(@RequestParam(value = "id", defaultValue = "1") int id){
       return studentService.getById(id);
    }
    @PostMapping("/save")
    public boolean saveStudent(@RequestBody(required = true) Student student){
       return studentService.save(student);
    }
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Student getByName(@RequestParam(value = "name", defaultValue = "roshan") String name) {
        return studentService.getByName(name);
    }
}
