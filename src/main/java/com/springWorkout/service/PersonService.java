package com.springWorkout.service;

import java.util.List;

import com.springWorkout.domain.Person;
import com.springWorkout.exceptions.InvalidApiResponseException;

/**
 * @author erhun.baycelik
 *
 */
public interface PersonService {
	Person getPerson(String id);

	void savePerson(Person person, String requestString) throws InvalidApiResponseException;

	void updatePerson(String id);

	void deletePerson(String id) throws InvalidApiResponseException;

	List<Person> getAllPerson();
}