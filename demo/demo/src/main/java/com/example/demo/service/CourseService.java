package com.example.demo.service;

import com.example.demo.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();
    public void add(Course newP){listCourse.add(newP);}
    public List<Course> GetAll(){return listCourse;}
}
