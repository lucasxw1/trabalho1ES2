package com.engenharia.trabalho1.repositories;

import com.engenharia.trabalho1.entities.Student;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findById(Long id);
    Student findByMatricula(String matricula);
    Student save(Student student);
    Student deleteStudentById(Id student);
    List<Student> findAll();


}
