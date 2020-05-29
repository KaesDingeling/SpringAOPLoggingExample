package de.kasedingeling.spring.aop.logging.example;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServer {
	
	@LogExecutionTime
	@GetMapping("ping")
	public String ping() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "pong";
	}
}