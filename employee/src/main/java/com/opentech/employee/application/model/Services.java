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
public class Services {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private Set<Employe> employes;

    @ManyToOne
    private Entreprise entreprise;
}
