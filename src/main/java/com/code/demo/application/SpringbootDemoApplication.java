package com.code.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan
//@ComponentScan("com.code.demo.application")
//@EntityScan("com.code.demo.application")
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
