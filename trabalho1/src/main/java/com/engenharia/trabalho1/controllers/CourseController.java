package com.engenharia.trabalho1.controllers;

import com.engenharia.trabalho1.entities.Course;
import com.engenharia.trabalho1.entities.Student;
import com.engenharia.trabalho1.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/course/getAll")
    public @ResponseBody List<Course> getAllCourses (){
        System.out.println("Getting Courses");
        return courseService.getAllCourses();

    }
}
