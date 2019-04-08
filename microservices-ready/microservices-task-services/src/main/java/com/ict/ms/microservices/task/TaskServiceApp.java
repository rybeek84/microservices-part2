package com.ict.ms.microservices.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TaskServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(TaskServiceApp.class, args);
	}

}
