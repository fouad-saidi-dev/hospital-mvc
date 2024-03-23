package com.fouadev.hospitalmvc.repositories;

import com.fouadev.hospitalmvc.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByName(String name);
}
