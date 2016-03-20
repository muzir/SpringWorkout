package com.springWorkout.service;

import java.util.List;

import com.springWorkout.domain.Person;

public interface PersonService {
	Person getPerson(String id);

	void savePerson(Person person);

	void updatePerson(String id);

	void deletePerson(String id);

	List<Person> getAllPerson();
}