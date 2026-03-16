package com.example.runspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RunspotApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunspotApplication.class, args);
	}

}
