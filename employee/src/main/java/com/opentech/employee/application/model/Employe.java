package com.opentech.employee.application.model;

import com.opentech.employee.application.enums.Genre;
import com.opentech.employee.application.enums.Role;
import com.opentech.employee.application.enums.SituationMatrimoniale;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employe {
    @Id
    @Column(unique = true)
    private String matricule;

    @Column(unique = true)
    private String cni;

    private String nom;

    private String prenom;

    @Column(columnDefinition = "text")
    private String adresse;

    @Column(unique = true)
    private String telephone;

    @Column(unique = true)
    private String email;

    private Genre genre;

    private LocalDate dateNaissance;

    private Double salaire;

    private String nationalite;

    private LocalDate dateEmbauche;

    private Role role;

    private SituationMatrimoniale situationMatrimoniale;

    @OneToMany
    private Set<Absence> absences;

    @OneToMany
    private Set<HoraireTravail> horaireTravails;

    @ManyToOne
    private Services services;
}
