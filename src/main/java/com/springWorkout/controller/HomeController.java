package com.springWorkout.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springWorkout.domain.Person;

//@Controller
@RequestMapping("/")
public class HomeController {
	// @Autowired
	// @Qualifier("personA")
	// private Person personA;
	// @Autowired
	// @Qualifier("personB")
	// private Person personB;

	ApplicationContext beans = new ClassPathXmlApplicationContext(
			"classpath:/beans.xml");

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("home");
		Person personA = (Person) beans.getBean("personA");
		Person personB = (Person) beans.getBean("personB");
		model.addObject("personA", personA);
		model.addObject("personB", personB);
		return model;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("home");
		Person personA = (Person) beans.getBean("personA");
		Person personB = (Person) beans.getBean("personB");
		personA.setClickCount(personA.getClickCount() + 1);
		personB.setClickCount(personB.getClickCount() + 1);
		model.addObject("personA", personA);
		model.addObject("personB", personB);
		return model;
	}
}
