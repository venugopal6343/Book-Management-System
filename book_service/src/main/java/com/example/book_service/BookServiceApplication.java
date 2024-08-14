package com.example.book_service;

import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class BookServiceApplication {
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
