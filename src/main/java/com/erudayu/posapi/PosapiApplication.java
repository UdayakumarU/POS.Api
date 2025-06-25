package com.erudayu.posapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosapiApplication.class, args);
	}

}
