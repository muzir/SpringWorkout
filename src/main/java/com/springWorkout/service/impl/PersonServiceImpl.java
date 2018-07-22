package com.springWorkout.service.impl;

import com.springWorkout.dao.PersonDao;
import com.springWorkout.domain.ApiLog;
import com.springWorkout.domain.Person;
import com.springWorkout.exceptions.ChechedException;
import com.springWorkout.service.ApiLogService;
import com.springWorkout.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonServiceImpl implements PersonService {

    private ApiLogService apiLogService;
    private PersonDao personDao;

    @Autowired
    public PersonServiceImpl(ApiLogService _apiLogService, PersonDao _personDao) {
        apiLogService = _apiLogService;
        personDao = _personDao;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void savePerson(Person person, String requestString) throws ChechedException {
        ApiLog apiLog = apiLogService.saveApiRequest(requestString);
        personDao.savePerson(person);
        apiLogService.saveResponseRequired(apiLog, person.toString());
    }


    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void deletePerson(String id) throws ChechedException {
        Person p = new Person.Builder().id(id).build();
        ApiLog apiLog = apiLogService.saveApiRequest(id);
        personDao.delete(p);
        apiLogService.saveResponseRequired(apiLog, p.toString());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> getAllPerson() {
        return personDao.getPersons();
    }

}
