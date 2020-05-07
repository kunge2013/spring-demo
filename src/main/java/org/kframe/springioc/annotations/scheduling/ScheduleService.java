package org.kframe.springioc.annotations.scheduling;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleService {

	long prefix = System.currentTimeMillis();

	@Scheduled(cron = "*/10 * * * * *")
	public void doTask() {
		long now = System.currentTimeMillis();
		Logger.getGlobal().setLevel(Level.INFO);
		Logger.getGlobal().info("测试日志输出");
		Logger logger = Logger.getLogger("JUL");
		logger.setLevel(Level.INFO);
		logger.info("dotask ....." + (prefix - (now)) / 1000);
		prefix = now;

	}
}
