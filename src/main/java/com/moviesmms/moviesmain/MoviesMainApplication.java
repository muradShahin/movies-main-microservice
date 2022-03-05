package com.moviesmms.moviesmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MoviesMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesMainApplication.class, args);
	}

}
