package com.springWorkout.service;

import java.util.List;

import com.springWorkout.domain.Person;

<<<<<<< HEAD
public interface PersonService {
	Person getPerson(String id);
	void savePerson(Person person);
	void updatePerson(String id);
	void deletePerson(String id);
	List<Person> getAllPerson();
=======
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
>>>>>>> 61b63dc573e40aff50c97ccdbd68c6661fec0f6f
}
