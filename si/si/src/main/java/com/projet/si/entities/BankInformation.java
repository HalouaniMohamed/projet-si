package com.projet.si.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BankInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rib;
    private String iban;
    private String bic;
}

