package com.springWorkout.service;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * <p>
 * <b> This class is created to inject objects, which is autowired at Quartz
 * Bean classes, to Spring Application Context .</b>
 * </p>
 * <p>
 * <p>
 * Check the dicussion at SO to understand the need of this class
 * </p>
 * http://stackoverflow.com/questions/6990767/inject-bean-reference-into-a-
 * quartz-job-in-spring
 * </p>
 */
public class SpringInjectQuartzJobBean {

    public void injectQuartzJobToSpringApplicationContext(Object obj) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(obj);
    }
}
