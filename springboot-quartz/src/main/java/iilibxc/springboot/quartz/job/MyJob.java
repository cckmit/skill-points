package iilibxc.springboot.quartz.job;

import iilibxc.springboot.quartz.service.MyService;
import iilibxc.springboot.quartz.util.ApplicationContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.Resource;

@Slf4j
//@Component
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

        log.info("任务开始执行了");
        try {
            executeTask();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        log.info("任务执行结束了");
    }

    private void executeTask() throws SchedulerException {

        MyService myService = (MyService) ApplicationContextUtils.getBean("myService");
        //myService.bizFunction();
    }
}
