package com.springWorkout.service.impl;

import org.springframework.stereotype.Service;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;
import com.springWorkout.service.ThirdPartyService;

/**
 * @author erhun.baycelik
 *
 */
@Service
public class ThirdPartyServiceImpl implements ThirdPartyService {

	@Override
	public void injectPersonDataToResponse(ConcurrencyResponseObject concurrencyResponseObject, Person person,
			String requestId) {
		System.out.println("requestId:" + requestId);
		concurrencyResponseObject.setPersonName(person.getName());
		concurrencyResponseObject.setPersonSurname(person.getSurname());
		concurrencyResponseObject.setTckNo(person.getTckNo());
	}
}
