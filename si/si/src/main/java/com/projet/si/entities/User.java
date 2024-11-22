package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String usageName;
    private String firstNames;
    private String birthDate;
    private String placeOfBirth;
    private String nationality;

    @OneToOne(cascade = CascadeType.ALL)
    private CivilStatus civilStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<OfficialIdentifier> officialIdentifiers;

    @OneToOne(cascade = CascadeType.ALL)
    private BankInformation bankInformation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<ProfessionalInformation> professionalInformation;

    @OneToOne(cascade = CascadeType.ALL)
    private Housing housing;

    @OneToOne(cascade = CascadeType.ALL)
    private FinancialResources financialResources;

    @OneToOne(cascade = CascadeType.ALL)
    private Disability disability;

    @OneToOne(cascade = CascadeType.ALL)
    private EmergencyContact emergencyContact;

    @OneToOne(cascade = CascadeType.ALL)
    private GeneralPractitioner generalPractitioner;
}
