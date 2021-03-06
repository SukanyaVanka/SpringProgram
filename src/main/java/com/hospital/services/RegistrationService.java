package com.hospital.services;

import com.hospital.models.Registration;
import com.hospital.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;


    public void registerUser(Registration registration) {
        registrationRepository.registerUser(registration);
    }
}