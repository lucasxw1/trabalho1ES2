package com.engenharia.trabalho1.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class ClassId implements Serializable {
    private String codClass;
    private String codCourse;
}
