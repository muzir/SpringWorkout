package com.springWorkout.quartz;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.springWorkout.service.SpringInjectQuartzJobBean;

public class LogConnectionPool implements Job {

	@Autowired
	private DataSource dataSource;

	private SpringInjectQuartzJobBean springInjectQuartzJobBean;

	public void setSpringInjectQuartzJobBean(SpringInjectQuartzJobBean springInjectQuartzJobBean) {
		this.springInjectQuartzJobBean = springInjectQuartzJobBean;
	}

	@Override
	public void execute(JobExecutionContext context) {
		springInjectQuartzJobBean = new SpringInjectQuartzJobBean();
		springInjectQuartzJobBean.injectQuartzJobToSpringApplicationContext(this);
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("\nds_InitialSize : " + dataSource.getInitialSize());
			sb.append("\nds_MaxActive :" + dataSource.getMaxActive());
			sb.append("\nds_MaxIdle :" + dataSource.getMaxIdle());
			sb.append("\nds_MinIdle :" + dataSource.getMinIdle());
			// sb.append("\nds_MaxWait :" + dataSource.getMaxWait());
			// sb.append("\nds_TestOnBorrow :" + dataSource.isTestOnBorrow());
			// sb.append("\nds_TestOnReturn :" + dataSource.isTestOnReturn());
			// sb.append("\nds_TestWhileIdle" + dataSource.isTestWhileIdle());
			// sb.append("\nds_TimeBetweenEvictionRunsMillis" +
			// dataSource.getTimeBetweenEvictionRunsMillis());
			// sb.append("\nds_MinEvictableIdleTimeMillis" +
			// dataSource.getMinEvictableIdleTimeMillis());
			// sb.append("\nds_LogAbandoned" + dataSource.isLogAbandoned());
			// sb.append("\nds_RemoveAbandoned" +
			// dataSource.isRemoveAbandoned());
			// sb.append("\nds_RemoveAbandonedTimeout" +
			// dataSource.getRemoveAbandonedTimeout());
			sb.append("\nds_NumActive" + dataSource.getNumActive());
			sb.append("\nds_NumIdle" + dataSource.getNumIdle());
			System.out.println("\n\n\nLog : " + sb.toString());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
