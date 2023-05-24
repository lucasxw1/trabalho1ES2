package com.engenharia.trabalho1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="COURSES")
public class Course {


    @Id
    private String codCourse;
    private String nome;
    @OneToMany(mappedBy="courseSch",fetch = FetchType.EAGER)
    // @JsonManagedReference
    private List<ScheduleClassCourse> classSchedule;

    public Course(String codigo, String nome) {
        this.setCodCourse(codigo);
        this.setNome(nome);
    }
}
