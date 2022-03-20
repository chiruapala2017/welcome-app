/**
 * 
 */
package com.tcs.poc.welcomefile.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author MF348841
 *
 */
@Component
public class PIBatchTaskScheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMYYYY HH:mm:ss");

	private static final Logger log = LoggerFactory.getLogger(PIBatchTaskScheduler.class);

	//@Scheduled(fixedRate = 3600000)
	@Scheduled(cron = "0 18 6,7,8,9,10,11,12,13,14,15,16,17,18 * * ?")
	//@Scheduled(cron="0 0/15 6-18 * * ?")
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
	}
	
	@Scheduled(fixedRate = 3600000)
	public void reportCurrentTime1() {
		log.info("The EST time is now {}", dateFormat.format(new Date()));
	}
}
