package com.springWorkout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springWorkout.dao.PersonDao;
import com.springWorkout.domain.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer savePerson(Person person) {
		return personDao.savePerson(person);
	}
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer savePersonWait(Person person) {
		return personDao.savePerson(person);
	}
}
