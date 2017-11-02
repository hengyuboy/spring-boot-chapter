package com.yuqiyu.chapter26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Chapter26Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter26Application.class, args);
	}
}
