package com.springWorkout.service;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;

public interface ThirdPartyService {

    void injectPersonDataToResponse(ConcurrencyResponseObject concurrencyResponseObject, Person person,
        String requestId);
}
