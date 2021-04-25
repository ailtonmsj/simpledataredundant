package br.com.amsj.simpleapi.redundant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimpleDataApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleDataApplication.class, args);
	}

}
