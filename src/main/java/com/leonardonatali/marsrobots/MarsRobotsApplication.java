package com.leonardonatali.marsrobots;

import com.leonardonatali.marsrobots.terrain.validators.SendCommandToRobotRequestValidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarsRobotsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRobotsApplication.class, args);
	}

	@Bean
	public SendCommandToRobotRequestValidator beforeCreateSendCommandToRobotRequestValidator() {
		return new SendCommandToRobotRequestValidator();
	}

}
