package com.example.project_pack.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String nom;
    private String prenom;
    @Column(name="cin", unique=true)
    private String cin;
    private String adresse;
    private String tel;
    private String email;
    @OneToMany(mappedBy = "client")
    private List<Voiture> voitures;



}
