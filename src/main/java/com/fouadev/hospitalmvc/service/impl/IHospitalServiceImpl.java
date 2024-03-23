package com.fouadev.hospitalmvc.service.impl;

import com.fouadev.hospitalmvc.entities.Consultation;
import com.fouadev.hospitalmvc.entities.Medecin;
import com.fouadev.hospitalmvc.entities.Patient;
import com.fouadev.hospitalmvc.entities.RendezVous;
import com.fouadev.hospitalmvc.repositories.ConsultationRepository;
import com.fouadev.hospitalmvc.repositories.MedecinRepository;
import com.fouadev.hospitalmvc.repositories.PatientRepository;
import com.fouadev.hospitalmvc.repositories.RendezVousRepository;
import com.fouadev.hospitalmvc.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IHospitalServiceImpl implements IHospitalService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    RendezVousRepository rendezVousRepository;
    @Autowired
    ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return null;
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return null;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return null;
    }
}
