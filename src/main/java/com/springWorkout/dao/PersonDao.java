package com.springWorkout.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springWorkout.domain.Person;

@Repository
public class PersonDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Integer savePerson(Person person) {
		Session session = sessionFactory.getCurrentSession();
		Integer insertedRecordCount = (Integer) session.save(person);
		session.flush();
		session.clear();
		return insertedRecordCount;
	}

}
