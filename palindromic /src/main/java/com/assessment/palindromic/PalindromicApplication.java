package com.assessment.palindromic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PalindromicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromicApplication.class, args);
	}

}
