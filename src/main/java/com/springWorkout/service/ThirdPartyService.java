package com.springWorkout.service;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;

/**
 * @author erhun.baycelik
 *
 */
public interface ThirdPartyService {
	void injectPersonDataToResponse(ConcurrencyResponseObject concurrencyResponseObject, Person person, String requestId);
}
