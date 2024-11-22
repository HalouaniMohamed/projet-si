package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FinancialResources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double taxableAnnualIncome;
    private Double familyAllowance;
    private Double rsa;
    private Double apl;
    private Double aah;
}
