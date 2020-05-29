package de.kasedingeling.spring.aop.logging.example;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@LogExecutionTime
	@PostConstruct
	public void serve() throws InterruptedException {
	    Thread.sleep(2000);
	}
}