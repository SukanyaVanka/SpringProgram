package com.hospital.hibernateUtils;

import com.hospital.models.Registration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HIbernateUtil {
    private static SessionFactory sessionFactory= buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Registration.class);
   ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);


    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
