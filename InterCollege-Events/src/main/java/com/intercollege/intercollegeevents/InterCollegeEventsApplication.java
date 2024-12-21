package com.intercollege.intercollegeevents;

import com.intercollege.intercollegeevents.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterCollegeEventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterCollegeEventsApplication.class, args);

        Student student = new Student("Ayush Puri");

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("something Arbitrary");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//        entityManager.persist(student);
//        transaction.commit();


    }
}
