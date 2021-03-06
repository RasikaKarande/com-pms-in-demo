package com.pms.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class ComPmsInDemoApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ComPmsInDemoApplication.class);
	public static void main(String[] args) {
		
		LOG.info("START");
		
		SpringApplication.run(ComPmsInDemoApplication.class, args);
		
		LOG.info("END");
	}

}
