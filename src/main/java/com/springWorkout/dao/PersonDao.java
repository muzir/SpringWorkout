package com.springWorkout.dao;

import com.springWorkout.domain.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author erhun.baycelik
 *
 */
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
		return session.createCriteria(Person.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	public void delete(Person person) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(person);

	}
}
