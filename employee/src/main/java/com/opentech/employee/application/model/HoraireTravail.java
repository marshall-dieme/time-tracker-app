package com.opentech.employee.application.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HoraireTravail {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    private LocalTime heureDebut;

    private LocalTime heureFin;

    private Boolean isNormalDay;

    private Integer heureSupp;

    @ManyToOne
    private Employe employe;
}
