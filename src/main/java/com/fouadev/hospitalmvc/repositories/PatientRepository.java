package com.fouadev.hospitalmvc.repositories;

import com.fouadev.hospitalmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);

    Page<Patient> findByNameContains(String search,Pageable pageable);
}
