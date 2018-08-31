package com.hospital.repositories;

import com.hospital.dbConnection.DbConnection;
import com.hospital.models.Doctor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class DoctorRepository {

    public void getDoctorsList(Doctor doctor) {

        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();


    }
}

