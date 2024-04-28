package com.fouadev.hospitalmvc.security.repo;

import com.fouadev.hospitalmvc.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}
