package com.fouadev.hospitalmvc.repositories;
/*
 Created by : Fouad SAIDI on 27/04/2024
 @author : Fouad SAIDI
 @date : 27/04/2024
 @project : hospital-mvc
*/

import com.fouadev.hospitalmvc.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String name);
}