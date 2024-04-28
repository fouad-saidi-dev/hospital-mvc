package com.fouadev.hospitalmvc;

import com.fouadev.hospitalmvc.entities.*;
import com.fouadev.hospitalmvc.repositories.ConsultationRepository;
import com.fouadev.hospitalmvc.repositories.MedecinRepository;
import com.fouadev.hospitalmvc.repositories.PatientRepository;
import com.fouadev.hospitalmvc.repositories.RendezVousRepository;
import com.fouadev.hospitalmvc.security.service.AccountService;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalMvcApplication {


    public static void main(String[] args) {
        SpringApplication.run(HospitalMvcApplication.class, args);
    }

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

////    @Bean
////    CommandLineRunner start(PatientRepository patientRepository,
////                            MedecinRepository medecinRepository,
////                            RendezVousRepository rendezVousRepository,
////                            ConsultationRepository consultationRepository){
////        return args -> {
////            Stream.of("Ali","Ahmed","Hiba")
////                            .forEach(name -> {
////                                Patient patient = new Patient();
////                                patient.setName(name);
////                                patient.setDateNaissance(new Date());
////                                patient.setMalade(false);
////                                patientRepository.save(patient);
////                            });
////
////            Stream.of("Youssef","Hanane","Reda")
////                    .forEach(name -> {
////                        Medecin medecin = new Medecin();
////                        medecin.setName(name);
////                        medecin.setEmail(name+"@gmail.com");
////                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
////                        medecinRepository.save(medecin);
////                    });
////
////            Patient patient = patientRepository.findByName("Ali");
////
////            Medecin medecin = medecinRepository.findByName("Hanane");
////
////            RendezVous rendezVous = new RendezVous();
////            rendezVous.setDate(new Date());
////            rendezVous.setStatus(StatusRDV.CANCELED);
////            rendezVous.setPatient(patient);
////            rendezVous.setMedecin(medecin);
////            rendezVousRepository.save(rendezVous);
////
////            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
////
////            Consultation consultation = new Consultation();
////            consultation.setDateConsultation(rendezVous1.getDate());
////            consultation.setRapport("Rapport ...");
////            consultation.setRendezVous(rendezVous1);
////            consultationRepository.save(consultation);
////
////
////
////
////        };
//    }

    //@Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager) {
        return args -> {
            UserDetails u1 = jdbcUserDetailsManager.loadUserByUsername("user11");
            if (u1 == null)
                jdbcUserDetailsManager.createUser(
                        User.withUsername("user11").password(passwordEncoder().encode("1234")).authorities("USER").build()
                );
            UserDetails u2 = jdbcUserDetailsManager.loadUserByUsername("user22");
            if (u2 == null)
                jdbcUserDetailsManager.createUser(
                        User.withUsername("user22").password(passwordEncoder().encode("1234")).authorities("USER").build()
                );
            UserDetails u3 = jdbcUserDetailsManager.loadUserByUsername("admin2");
            if (u3 == null)
                jdbcUserDetailsManager.createUser(
                        User.withUsername("admin2").password(passwordEncoder().encode("1234")).authorities("USER", "ADMIN").build()
                );
        };
    }
    //@Bean
    CommandLineRunner commandLineRunnerUserDetails(AccountService accountService){
        return args -> {
            accountService.addNewRole("USER");
            accountService.addNewRole("ADMIN");

            accountService.addNewUser("user1","1234","user1@gmail.com","1234");
            accountService.addNewUser("user2","1234","user2@gmail.com","1234");
            accountService.addNewUser("admin","1234","admin@gmail.com","1234");

            accountService.addRoleToUser("user1","USER");
            accountService.addRoleToUser("user2","USER");
            accountService.addRoleToUser("admin","USER");
            accountService.addRoleToUser("admin","ADMIN");
        };
    }
}
