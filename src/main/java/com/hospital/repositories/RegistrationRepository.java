package com.hospital.repositories;

import com.hospital.dbConnection.DbConnection;
import com.hospital.hibernateUtils.HIbernateUtil;
import com.hospital.models.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class RegistrationRepository {



    public void registerUser(Registration registration) {
//        DbConnection dbConnection = new DbConnection();
//        Connection connection = dbConnection.createConnection();
//        dbConnection.registerUser(connection, registration);


    SessionFactory sessionFactory=HIbernateUtil.getSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction transaction=session.beginTransaction();
    session.save(registration);
    transaction.commit();

}
}