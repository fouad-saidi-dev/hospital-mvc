package com.fouadev.hospitalmvc.repositories;

import com.fouadev.hospitalmvc.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
