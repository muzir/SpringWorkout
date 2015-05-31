package com.springWorkout.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springWorkout.domain.Person;
import com.springWorkout.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	public PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doGet(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("person");
		Random r = new Random();

		Person p = new Person();
		p.setId(r.nextInt());
		p.setName("test" + r.nextInt());
		p.setClickCount(0);

		Integer pReturn = personService.savePerson(p);

		System.out.println("pReturn:" + pReturn);
		System.out.println(p);
		return model;
	}
}
