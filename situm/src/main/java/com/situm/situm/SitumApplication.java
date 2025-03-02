package com.situm.situm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.situm")
public class SitumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitumApplication.class, args);
	}

}	