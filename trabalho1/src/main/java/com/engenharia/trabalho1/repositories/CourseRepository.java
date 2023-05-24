package com.engenharia.trabalho1.repositories;

import com.engenharia.trabalho1.entities.Course;
import com.engenharia.trabalho1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {
    public Course findByCodCourse(String codCourse);
    public Course findByNome(String nome);

    List<Course> findAll();


}
