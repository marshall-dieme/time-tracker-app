package com.opentech.employee.application.model;

import com.opentech.employee.application.enums.Status;
import com.opentech.employee.application.enums.TypeAbsence;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Absence {
    @Id
    @GeneratedValue
    private Long id;

    private TypeAbsence motif;

    private String justificatif;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private Status status;

}
