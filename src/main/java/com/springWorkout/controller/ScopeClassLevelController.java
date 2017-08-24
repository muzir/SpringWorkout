package com.springWorkout.controller;

import com.springWorkout.domain.Click;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author erhun.baycelik </br>
 * ScopeClassLevelController is annotated with {@code @Scope} annotation so this bean scope is prototype
 *
 */
@Controller
@RequestMapping("/scope/classLevel")
@Scope(value = "prototype")
public class ScopeClassLevelController {
	@Autowired
	@Qualifier("clickSingleton")
	private Click clickSingleton;
	@Autowired
	@Qualifier("clickPrototype")
	private Click clickPrototype;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("scopeClassLevel");
		model.addObject("clickPrototype", clickPrototype);
		model.addObject("clickSingleton", clickSingleton);
		return model;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("scopeClassLevel");
		clickSingleton.setClickCount(clickSingleton.getClickCount() + 1);
		clickPrototype.setClickCount(clickPrototype.getClickCount() + 1);
		model.addObject("clickSingleton", clickSingleton);
		model.addObject("clickPrototype", clickPrototype);
		return model;
	}
}
