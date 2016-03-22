package com.springWorkout.controller;

import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;
import com.springWorkout.service.ThirdPartyService;
import com.springWorkout.service.ThirdPartyServiceFactory;

@Controller
@RequestMapping(value = "concurrency")
public class ConcurrenceController {
	@Autowired
	private ThirdPartyService thirdPartyService;

	@Autowired
	private ThirdPartyServiceFactory thirdPartyServiceFactory;

	@ResponseBody
	public ConcurrencyResponseObject doPost(HttpServletRequest request) {
		String isThirdPartyApiCall = request.getParameter("thirdPartApiCall");
		String requestId = request.getParameter("requestId");
		SecureRandom sr = new SecureRandom();
		String personId = String.valueOf(sr.nextInt());
		Person person = new Person.Builder().id(personId).name("concurrencyName-" + personId)
				.surname("surname" + personId).tckNo("").build();
		ConcurrencyResponseObject concurrencyResponseObject = new ConcurrencyResponseObject();
		thirdPartyService = thirdPartyServiceFactory.getThirdPartyService(isThirdPartyApiCall);
		thirdPartyService.injectPersonDataToResponse(concurrencyResponseObject, person);
		concurrencyResponseObject.setResponseCode("00");
		concurrencyResponseObject.setResponseMessage("Sucessfull");
		return concurrencyResponseObject;
	}
}
