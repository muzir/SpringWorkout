package com.springWorkout.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWorkout.dao.PersonDao;
import com.springWorkout.domain.ApiLog;
import com.springWorkout.domain.Person;
import com.springWorkout.exceptions.InvalidApiResponseException;
import com.springWorkout.service.ApiLogService;
import com.springWorkout.service.PersonService;

/**
 * @author erhun.baycelik
 *
 */
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private ApiLogService apiLogService;
	@Autowired
	private PersonDao personDao;

	@Override
	public Person getPerson(String id) {
		return null;
	}

	@Override
	public void savePerson(Person person, String requestString) throws InvalidApiResponseException {
		ApiLog apiLog = apiLogService.saveApiRequest(requestString);
		personDao.savePerson(person);
		apiLogService.saveApiResponse(apiLog, person.toString());
	}

	@Override
	public void updatePerson(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deletePerson(String id) throws InvalidApiResponseException {
		Person p = new Person.Builder().id(id).build();
		ApiLog apiLog = apiLogService.saveApiRequest(id);
		personDao.delete(p);
		apiLogService.saveApiResponse(apiLog, p.toString());
	}

	@Override
	public List<Person> getAllPerson() {
		return personDao.getPersons();
	}

}
