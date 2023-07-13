package com.opentech.employee.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Projet {
    @Id
    @Column(unique = true)
    private Long numeroProjet;

    @Column(unique = true)
    private String codeProjet;

    private String nomProjet;

    @Column(columnDefinition = "text")
    private String description;

    private String client;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private LocalDate dateFinEffective;

    @ManyToOne
    private Employe responsable;

    @ManyToMany
    private Set<Employe> employes;

}
