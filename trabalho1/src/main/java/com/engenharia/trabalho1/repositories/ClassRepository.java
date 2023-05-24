package com.engenharia.trabalho1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.engenharia.trabalho1.entities.Class;


public interface ClassRepository extends JpaRepository<Class,String> {
}
