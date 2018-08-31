package com.hospital.services;

import com.hospital.models.Doctor;
import com.hospital.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public void doctorService(Doctor doctor) {

        doctorRepository.getDoctorsList(doctor);




    }
}
