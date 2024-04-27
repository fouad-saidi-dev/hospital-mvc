package com.fouadev.hospitalmvc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 Created by : Fouad SAIDI on 27/04/2024
 @author : Fouad SAIDI
 @date : 27/04/2024
 @project : hospital-mvc
*/
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AppRole {
    @Id
    private String role;
}