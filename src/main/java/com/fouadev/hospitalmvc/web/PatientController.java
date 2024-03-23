package com.fouadev.hospitalmvc.web;

import com.fouadev.hospitalmvc.entities.Patient;
import com.fouadev.hospitalmvc.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String patients(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("ListPatients",patients);
        return "patients";
    }

    @GetMapping("/formPatients")
    public String formPatient(Model model) {
        model.addAttribute("patient",new Patient());
        return "formPatients";
    }

    @PostMapping("/save")
    public String save(Model model,Patient patient) {
        patientRepository.save(patient);
        return "formPatients";
    }
}
