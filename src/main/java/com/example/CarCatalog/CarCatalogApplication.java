package com.example.CarCatalog;

import com.example.CarCatalog.controller.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarCatalogApplication implements CommandLineRunner {

	@Autowired
	private CarController carController;

	public static void main(String[] args) {
		SpringApplication.run(CarCatalogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		carController.start();
	}
}
