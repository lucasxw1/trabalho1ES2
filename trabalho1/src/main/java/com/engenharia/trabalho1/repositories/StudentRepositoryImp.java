package com.engenharia.trabalho1.repositories;

import com.engenharia.trabalho1.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public abstract class StudentRepositoryImp implements StudentRepository {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
    @Override
    public Student findByMatricula(String matricula) {
        return studentRepository.findByMatricula(matricula);
    }

    @Override
    public Student save(Student student) { return studentRepository.save(student); }

    @Override
    public Student deleteStudentById(Id id)  { return studentRepository.deleteStudentById(id); }

    @Override
    public List<Student> findAll()  { return studentRepository.findAll(); }

}
