package com.springWorkout.quartz;

public class QuartzTest {
/*	public static void main(String[] args) {
		try {
			SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();

			Scheduler sched = schedFact.getScheduler();

			sched.start();

			// define the job and tie it to our HelloJob class
			JobDetail jobDetail = newJob(HelloJob.class).withIdentity("myJob",
					"group1").build();

			// Trigger the job to run now, and then every 40 seconds
			SimpleTrigger trigger = newTrigger()
					.withIdentity("myTrigger", "group1")
					.startNow()
					.withSchedule(
							simpleSchedule().withIntervalInSeconds(40)
									.repeatForever()).build();

			// Tell quartz to schedule the job using our trigger
			sched.scheduleJob(jobDetail, trigger);

		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}*/
}
