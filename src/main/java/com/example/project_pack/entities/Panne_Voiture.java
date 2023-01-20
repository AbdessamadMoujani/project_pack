package com.example.project_pack.entities;

import com.example.project_pack.enums.TypePanne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor
public class Panne_Voiture {
    private long id;
    private TypePanne typePanne;
    private boolean resolu;
    private String description;
    private Voiture voiture;

}
