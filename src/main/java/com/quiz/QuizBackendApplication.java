package com.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class QuizBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(QuizBackendApplication.class, args);
	}



}
