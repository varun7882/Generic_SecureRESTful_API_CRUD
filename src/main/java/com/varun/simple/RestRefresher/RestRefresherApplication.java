package com.varun.simple.RestRefresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.varun.simple.RestRefresher.repository")
@SpringBootApplication
public class RestRefresherApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestRefresherApplication.class, args);
	}
}
