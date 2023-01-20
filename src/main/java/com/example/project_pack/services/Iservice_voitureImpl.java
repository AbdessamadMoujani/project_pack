package com.example.project_pack.services;

import com.example.project_pack.entities.Voiture;
import com.example.project_pack.repositories.VoitureRepository;

import java.util.List;

public class Iservice_voitureImpl implements Iservice_voiture {
    VoitureRepository voitureRepository;
    @Override
    public Voiture findVoiture(Long Id) {
        Voiture v = voitureRepository.findById(Id).get();
        return v;
    }

    @Override
    public List<Voiture> ListVoitures() {
        List<Voiture> voitures = voitureRepository.findAll();

        return voitures;
    }

    @Override
    public Voiture saveVoitureClient(Voiture v) {
        Voiture voiture = voitureRepository.save(v);
        return voiture;
    }
}
