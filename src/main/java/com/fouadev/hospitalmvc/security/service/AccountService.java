package com.fouadev.hospitalmvc.security.service;

import com.fouadev.hospitalmvc.entities.AppRole;
import com.fouadev.hospitalmvc.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username,String password,String email,String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username,String role);
    void removeRoleFromUser(String username,String role);
    AppUser loadUserByUsername(String username);
}
