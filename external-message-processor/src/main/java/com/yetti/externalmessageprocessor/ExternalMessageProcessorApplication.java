package com.yetti.externalmessageprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ExternalMessageProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalMessageProcessorApplication.class, args);
		log.info("ExternalMessageProcessorApplication - started successfully");
	}

}
