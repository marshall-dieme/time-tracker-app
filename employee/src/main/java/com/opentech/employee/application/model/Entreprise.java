package com.opentech.employee.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Entreprise {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String nom;

    @Column(columnDefinition = "text")
    private String adresse;

    @Column(unique = true)
    private String telephone;

    @OneToMany
    private Set<Services> services;
}
