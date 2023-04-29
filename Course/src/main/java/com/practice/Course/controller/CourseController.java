package com.practice.Course.controller;

import com.practice.Course.entity.Course;
import com.practice.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping
    public boolean create(@RequestBody Course course){
        return courseService.create(course);
    }
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAll();
    }

    @GetMapping("/id")
    public Course getById(@RequestParam(value = "id", defaultValue = "1")int id){
        return courseService.getById(id);
    }

    @PutMapping
    public boolean update(@RequestBody Course course){
        return courseService.update(course);
    }
    @DeleteMapping
    public boolean delete(@RequestParam int id){
        return courseService.delete(id);
    }

}
