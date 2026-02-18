package com.example;

import com.example.model.Cricket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.example") @Configuration @EnableAutoConfiguration

public class DemoAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		Cricket cricket = new Cricket();

	}

}
