package com.springWorkout.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springWorkout.domain.Person;

@Repository
public class PersonDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void savePerson(Person person) {
		Session session = sessionFactory.getCurrentSession();
		session.save(person);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		Session session = sessionFactory.getCurrentSession();
<<<<<<< HEAD
		return session.createCriteria(Person.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
=======
		Integer insertedRecordCount = (Integer) session.save(person);
		session.flush();
		session.clear();
		return insertedRecordCount;
>>>>>>> 61b63dc573e40aff50c97ccdbd68c6661fec0f6f
	}

}
