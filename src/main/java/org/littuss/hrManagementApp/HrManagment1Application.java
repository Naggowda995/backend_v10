package org.littuss.hrManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.littuss.hrManagementApp"})
public class HrManagment1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrManagment1Application.class, args);
	}

}
