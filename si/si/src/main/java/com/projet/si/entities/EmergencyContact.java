package com.projet.si.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phone;
    private String email;
}
