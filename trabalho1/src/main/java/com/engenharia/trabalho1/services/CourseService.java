package com.engenharia.trabalho1.services;

import com.engenharia.trabalho1.entities.Course;
import com.engenharia.trabalho1.entities.Student;
import com.engenharia.trabalho1.repositories.CourseRepository;
import com.engenharia.trabalho1.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Boolean InsertCourse(Course course){
        Course courseSave = courseRepository.save(course);
        if(courseSave != null){ return true;}
        else{return false;}
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}
