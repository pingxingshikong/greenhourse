package com.i1314i.greenhourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.i1314i.greenhourse")
public class GreenhourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenhourseApplication.class, args);
	}
}
