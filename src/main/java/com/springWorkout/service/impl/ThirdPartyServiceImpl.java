package com.springWorkout.service.impl;

import org.springframework.stereotype.Service;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;
import com.springWorkout.service.ThirdPartyService;

@Service
public class ThirdPartyServiceImpl implements ThirdPartyService {

	@Override
	public void injectPersonDataToResponse(ConcurrencyResponseObject concurrencyResponseObject, Person person) {
		
	}
}
