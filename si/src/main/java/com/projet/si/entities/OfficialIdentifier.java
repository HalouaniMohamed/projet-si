package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OfficialIdentifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ine;
    private String cafNumber;
    private String employmentAgencyNumber;
    private String fiscalNumber;
    private String socialSecurityNumber;

    @ManyToOne
    private User user;
}
