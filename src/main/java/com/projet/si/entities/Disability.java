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
    private String guardianFirstName;
    private String guardianAddress;
    private String guardianPhone;
    private String guardianEmail;
    private String caregiverName;
    private String caregiverFirstName;
    private String caregiverAddress;
    private String caregiverPhone;
    private String caregiverEmail;
    private String healthIssues;
}
