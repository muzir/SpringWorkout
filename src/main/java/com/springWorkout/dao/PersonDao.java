package com.springWorkout.dao;

import com.springWorkout.domain.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PersonDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void savePerson(Person person) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.saveOrUpdate(person);
    }

    @SuppressWarnings("unchecked")
    public List<Person> getPersons() {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteria = builder.createQuery(Person.class);
        Root contactRoot = criteria.from(Person.class);
        criteria.select(contactRoot);
        return session.createQuery(criteria).getResultList();
    }

    public void delete(Person person) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.delete(person);

    }
}
