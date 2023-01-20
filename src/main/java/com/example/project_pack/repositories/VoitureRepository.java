package com.example.project_pack.repositories;

import com.example.project_pack.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {

}
