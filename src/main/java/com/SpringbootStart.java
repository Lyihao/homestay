package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStart {
	public static void main(String[] args) {
		System.out.println("项目启动");
		SpringApplication.run(SpringbootStart.class, args);
	}
}
