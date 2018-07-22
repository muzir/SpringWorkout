package com.springWorkout.controller;

import com.springWorkout.domain.Click;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * ScopeMethodLevelController default bean scope is singleton
 */
@Controller
@RequestMapping("/scope/methodLevel")
public class ScopeMethodLevelController {

    private final ApplicationContext beans;

    @Autowired
    private ScopeMethodLevelController(ApplicationContext applicationContext) {
        beans = applicationContext;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("scopeMethodLevel");
        Click clickSingleton = (Click) beans.getBean("clickSingleton");
        Click clickPrototype = (Click) beans.getBean("clickPrototype");
        model.addObject("clickPrototype", clickPrototype);
        model.addObject("clickSingleton", clickSingleton);
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView post(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("scopeMethodLevel");
        Click clickSingleton = (Click) beans.getBean("clickSingleton");
        Click clickPrototype = (Click) beans.getBean("clickPrototype");
        clickSingleton.setClickCount(clickSingleton.getClickCount() + 1);
        clickPrototype.setClickCount(clickPrototype.getClickCount() + 1);
        model.addObject("clickSingleton", clickSingleton);
        model.addObject("clickPrototype", clickPrototype);
        return model;
    }
}
