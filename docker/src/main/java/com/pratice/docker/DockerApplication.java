package com.pratice.docker;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	private static Logger logger=LogManager.getLogger(DockerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);

		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")  
                .withZone(ZoneId.systemDefault()); // or specify a specific time zone  
				
		logger.info("Application Started on : {}",formatter.format(Instant.now()));

	}

}
