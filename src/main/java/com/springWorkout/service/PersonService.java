package com.springWorkout.service;

import com.springWorkout.domain.Person;
import com.springWorkout.exceptions.ChechedException;

import java.util.List;

/**
 * @author erhun.baycelik
 *
 */
public interface PersonService {
	void savePerson(Person person, String requestString) throws ChechedException;

	void deletePerson(String id) throws ChechedException;

	List<Person> getAllPerson();
}