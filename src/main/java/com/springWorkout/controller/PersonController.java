package com.springWorkout.controller;

import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springWorkout.domain.Person;
import com.springWorkout.service.PersonService;

/**
 * @author erhun.baycelik
 *
 */
@Controller
public class PersonController {
	@Autowired
	public PersonService personService;

	@RequestMapping(value = "app/person", method = RequestMethod.GET)
	public ModelAndView doGet(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("result");
		SecureRandom r = new SecureRandom();
		Person p = new Person();
		p.setId(r.nextInt());
		p.setName("test" + r.nextInt());
		p.setClickCount(0);
		System.out.println("Person will be insert :" + p);
		Integer pReturn = personService.savePerson(p);
		System.out.println("pReturn:" + pReturn);
		model.addObject("response", "00");
		return model;
	}

	@RequestMapping(value = "app/personOne", method = RequestMethod.GET)
	public ModelAndView doGetOne(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("result");
		SecureRandom r = new SecureRandom();
		Person p = new Person();
		p.setId(r.nextInt());
		p.setName("test" + r.nextInt());
		p.setClickCount(0);
		System.out.println("Person will be insert :" + p);
		Integer pReturn = personService.savePerson(p);
		System.out.println("pReturn:" + pReturn);
		model.addObject("response", "00");
		return model;
	}

	@RequestMapping(value = "app/personTwo", method = RequestMethod.GET)
	public ModelAndView doGetTwo(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("result");
		SecureRandom r = new SecureRandom();
		Person p = new Person();
		p.setId(r.nextInt());
		p.setName("test" + r.nextInt());
		p.setClickCount(0);
		System.out.println("Person will be insert :" + p);
		Integer pReturn = personService.savePerson(p);
		System.out.println("pReturn:" + pReturn);
		model.addObject("response", "00");
		return model;
	}
}
