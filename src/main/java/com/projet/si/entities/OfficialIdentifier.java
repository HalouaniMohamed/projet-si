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
    private String allocataire;
    private String poleEmploi;
    private String fiscalNumber;
    private String socialSecurity;
}
