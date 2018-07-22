package com.springWorkout.quartz;

import com.springWorkout.service.SpringInjectQuartzJobBean;
import com.zaxxer.hikari.HikariDataSource;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class LogConnectionPool implements Job {

    @Autowired
    private HikariDataSource dataSource;

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
            sb.append("\nds_MaximumPoolSize :" + dataSource.getMaximumPoolSize());
            sb.append("\nds_MinIdle :" + dataSource.getMinimumIdle());
            System.out.println("\n\n\nLog : " + sb.toString());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
