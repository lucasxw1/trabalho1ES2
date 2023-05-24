package com.engenharia.trabalho1.services;

import com.engenharia.trabalho1.entities.Student;
import com.engenharia.trabalho1.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Boolean InsertStudent(Student student){
        Student studentSave = studentRepository.save(student);
        if(studentSave != null){ return true;}
        else{return false;}
    }

    public Student getById(Long id){
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public Student getByMatricula(String matricula){
        Student student = studentRepository.findByMatricula(matricula);
        return student;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }



}
