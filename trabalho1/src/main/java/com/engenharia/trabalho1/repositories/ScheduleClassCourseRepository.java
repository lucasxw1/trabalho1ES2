package com.engenharia.trabalho1.repositories;

import com.engenharia.trabalho1.entities.ClassId;
import com.engenharia.trabalho1.entities.ScheduleClassCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleClassCourseRepository extends JpaRepository<ScheduleClassCourse, ClassId> {
    public ScheduleClassCourse findByScheduleClassId(ClassId id);
}
