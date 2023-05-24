package com.engenharia.trabalho1.controllers;

import com.engenharia.trabalho1.entities.Student;
import com.engenharia.trabalho1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/register/student")
    public void registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");

        //StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        //StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        //stdregreply.setName(student.getName());
        //stdregreply.setAge(student.getAge());
        //stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        //stdregreply.setRegistrationStatus("Successful");

    }

    @GetMapping("/student/{matricula}")
    public @ResponseBody Student getStudentByMatricula (@PathVariable(value="matricula") String matricula){
        System.out.println("Getting student");
        return studentService.getByMatricula(matricula);

    }

    @GetMapping("/student/getAll")
    public @ResponseBody List<Student> getAllStudents (){
        System.out.println("Getting students");
        return studentService.getAllStudents();

    }


}
