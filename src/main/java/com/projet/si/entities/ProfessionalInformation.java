package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ProfessionalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String professionalStatus;
    private String socioProfessionalCategory;
    private Double monthlyIncome;
    private Double annualNetSalary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professionalInformation")
    private List<Contract> contracts;
}
