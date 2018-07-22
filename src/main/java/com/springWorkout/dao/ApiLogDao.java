package com.springWorkout.dao;

import com.springWorkout.domain.ApiLog;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ApiLogDao {


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void save(ApiLog apiLog) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.save(apiLog);
    }

    public void saveOrUpdate(ApiLog apiLog) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.saveOrUpdate(apiLog);
    }
}
