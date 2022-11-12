package com.example.demo;

import com.example.demo.Domain.Student;
import com.sun.jdi.connect.spi.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.DriverManager;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}


}
