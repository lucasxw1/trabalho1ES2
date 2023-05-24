package com.engenharia.trabalho1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Class {

    @Id
    private String codClass;
    @OneToMany(mappedBy="classSch",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<ScheduleClassCourse> CourseSchedule;

    public Class(String codClass) {
        this.setCodClass(codClass);
    }
}
