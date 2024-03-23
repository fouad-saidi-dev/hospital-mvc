package com.fouadev.hospitalmvc.service;

import com.fouadev.hospitalmvc.entities.Consultation;
import com.fouadev.hospitalmvc.entities.Medecin;
import com.fouadev.hospitalmvc.entities.Patient;
import com.fouadev.hospitalmvc.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
