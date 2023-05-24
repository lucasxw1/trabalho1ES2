package com.engenharia.trabalho1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    String rg;
    String name;
    String address;

    String matricula;

    //@ManyToMany
    //Set<ScheduleClassCourse> courses;

    //@ManyToMany(mappedBy = "students")
    //private List<ScheduleClassCourse> scheduleClassCourses;

    public Student(String rg, String name, String address){
        this.name = name;
        this.address = address;
        this.rg = rg;
    }
}
