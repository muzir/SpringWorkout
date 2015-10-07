package com.springWorkout.service;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.springframework.context.SmartLifecycle;

import com.springWorkout.quartz.LogConnectionPool;

public class SpringWorkoutSmartLifeCycle implements SmartLifecycle {
	private Scheduler sched;

	@Override
	public void start() {
		// try {
		// SchedulerFactory schedFact = new
		// org.quartz.impl.StdSchedulerFactory();
		// sched = schedFact.getScheduler();
		//
		// sched.start();
		//
		// // define the job and tie it to our LogConnectionPool class
		// JobDetail jobDetail = newJob(LogConnectionPool.class)
		// .withIdentity("LogConnectionPool", "groupLogConnectionPool").build();
		//
		// // Trigger the job to run now, and then every 40 seconds
		// SimpleTrigger trigger =
		// newTrigger().withIdentity("LogConnectionPoolTrigger",
		// "groupLogConnectionPool")
		// .startNow().withSchedule(simpleSchedule().withIntervalInSeconds(10).repeatForever()).build();
		//
		// // Tell quartz to schedule the job using our trigger
		// sched.scheduleJob(jobDetail, trigger);
		//
		// } catch (SchedulerException se) {
		// se.printStackTrace();
		// }
		// ;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		// try {
		// if (sched != null && !sched.isShutdown()) {
		// sched.shutdown();
		// }
		// } catch (SchedulerException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
