package com.example.Login_and_registration_system.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);

}