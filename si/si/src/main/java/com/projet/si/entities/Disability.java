package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Disability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double disabilityRate;
    private String guardianName;
    private String caregiverName;
    private String healthIssues;
}
