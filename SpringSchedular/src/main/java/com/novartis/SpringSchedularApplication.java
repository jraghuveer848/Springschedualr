package com.novartis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedularApplication.class, args);
		System.out.println("Application started..");
		System.out.println("latest========");
		first();
	}

	private static void first() {
		// TODO Auto-generated method stub
		System.out.println("First");
	}

}
