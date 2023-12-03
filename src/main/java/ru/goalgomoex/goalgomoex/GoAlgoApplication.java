package ru.goalgomoex.goalgomoex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GoAlgoApplication {
	public static void main(String[] args) {
		SpringApplication.run(GoAlgoApplication.class, args);
	}
}
