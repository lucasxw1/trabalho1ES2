package com.engenharia.trabalho1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Schedule_Class_Course")
public class ScheduleClassCourse {

    @EmbeddedId
    private ClassId scheduleClassId;
    private String Schedule;

    @ManyToOne
    // @JsonBackReference
    @JoinColumn(name = "codCourse", insertable=false, updatable=false)
    private Course courseSch;

    @ManyToOne
    // @JsonIgnore
    @JoinColumn(name = "codClass", insertable=false, updatable=false)
    private Class classSch;

    //@ManyToMany(mappedBy = "courses")
    //Set<Student> students;


    public ScheduleClassCourse(ClassId classId, String schedule) {
        this.setScheduleClassId(classId);
        this.setSchedule(schedule);
    }


    public String toString(){
        return this.getScheduleClassId().getCodClass() + " - " + this.getScheduleClassId().getCodCourse() + " - " + this.getSchedule();
    }
}
