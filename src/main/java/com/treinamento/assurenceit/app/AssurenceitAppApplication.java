package com.treinamento.assurenceit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AssurenceitAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssurenceitAppApplication.class, args);
	}

}
