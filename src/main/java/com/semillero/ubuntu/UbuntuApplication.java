package com.semillero.ubuntu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UbuntuApplication {

	public static void main(String[] args) {
		SpringApplication.run(UbuntuApplication.class, args);
		System.out.println("Ubuntu Project Start.");
	}

}
