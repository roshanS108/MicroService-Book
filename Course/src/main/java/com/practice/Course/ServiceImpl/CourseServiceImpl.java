package com.practice.Course.ServiceImpl;

import com.practice.Course.entity.Course;
import com.practice.Course.repository.CourseRepository;
import com.practice.Course.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
    @Override
    public boolean create(Course course) {
        //insert into course(name, duration) values ("Physics", 4)
        courseRepository.save(course);
        return true;
    }
    @Override
    public Course getById(int courseId) {
        //select * from course where id = 1;
        Course course = courseRepository.findById(courseId).orElse(null);
        return course;

    }
    @Override
    public List<Course> getAll() {
        //Select*from course
        List<Course>courseList = courseRepository.findAll();
        return courseList;
    }

    @Override
    public boolean update(Course course) {
        courseRepository.save(course);
        return true;
    }
    @Override
    public boolean delete(int courseId) {
        courseRepository.deleteById(courseId);
        return true;
    }
}
