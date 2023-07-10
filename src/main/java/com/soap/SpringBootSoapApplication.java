package com.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSoapApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
		LOGGER.info("Inicia calculadora");
	}

} 
