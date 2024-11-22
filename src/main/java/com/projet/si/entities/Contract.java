package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contractType;
    private String startDate;
    private String endDate;
    private String companyName;
    private String employerName;

    @ManyToOne
    private ProfessionalInformation professionalInformation;
}
