package com.example.project_pack.entities;

import com.example.project_pack.enums.Categorie;
import com.example.project_pack.enums.Energie;
import com.example.project_pack.enums.Etat;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {

    private String id;
    private  String marque;
    private String modele;
    private Categorie categorie;
    private Energie energie;
    private Etat etat;
    private long prixJour;
    private Date dateCirculation;
    private int kilometrage;
    private List<Panne_Voiture> panne_voitures;
    private Papier papier;


}
