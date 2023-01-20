package com.example.project_pack.services;

import com.example.project_pack.entities.Voiture;

import java.util.List;

public interface Iservice_voiture {

    public Voiture findVoiture(Long Id);
    public List<Voiture> ListVoitures();
    public Voiture saveVoitureClient(Voiture v);
}
