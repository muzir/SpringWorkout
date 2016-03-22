package com.springWorkout.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWorkout.dao.PersonDao;
import com.springWorkout.domain.Person;
import com.springWorkout.service.PersonService;

/**
 * @author erhun.baycelik
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public Person getPerson(String id) {
		return null;
	}

	@Override
	public void savePerson(Person person) {
		personDao.savePerson(person);
	}

	@Override
	public void updatePerson(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePerson(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> getAllPerson() {
		return personDao.getPersons();
	}

}
