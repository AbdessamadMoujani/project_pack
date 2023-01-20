package com.example.project_pack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Papier {
    private long id;
    private Date date_assurance;
    private Date date_vignette;
    private Date date_visiteTechnique;
    private Voiture voiture;
}
