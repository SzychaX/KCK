package com.example.CarCatalog.controller;

import com.example.CarCatalog.model.Car;
import com.example.CarCatalog.service.CarService;
import com.example.CarCatalog.view.CarView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private CarView carView;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            carView.showMenu(); // Zmieniono na wywołanie widoku menu
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> listCars();
                case 2 -> addCar(scanner);
                case 3 -> deleteCar(scanner);
                case 4 -> listCar(scanner);
                case 5 -> displayByBrand(scanner);
                case 6 -> displayByVersion(scanner);
                case 7 -> System.exit(0);
                default -> carView.displayInvalidOption(); // Przeniesienie komunikatu o nieprawidłowej opcji do widoku
            }
        }
    }

    private void listCars() {
        carView.listCars(carService.getAllCars()); // Zmieniono na wywołanie widoku listy aut
    }

    private void addCar(Scanner scanner) {
        Car car = carView.addCar(scanner); // Wywołanie metody widoku do dodania auta
        carService.saveCar(car);
        carView.displayCarAdded(); // Komunikat o dodaniu samochodu
    }

    private void deleteCar(Scanner scanner) {
        long id = carView.promptForCarId(scanner); // Wywołanie metody widoku dla wprowadzenia ID
        carService.deleteCar(id);
        carView.displayCarRemoved(id); // Komunikat o usunięciu auta w widoku
    }

    private void listCar(Scanner scanner) {
        long id = carView.promptForCarId(scanner); // Wywołanie metody widoku dla wprowadzenia ID
        Car car = carService.getCarById(id);
        if (car != null) {
            carView.displayCarBrand(car.getBrand());
            carView.displayCarDetails(car); // Wyświetlenie szczegółów auta
        } else {
            carView.displayCarNotFound(id); // Komunikat o nieznalezieniu auta
        }
    }
    public void displayByBrand(Scanner scanner) {
        carView.displayPromptForBrandSearch();
        carView.listCars(carService.getCarsByBrand(scanner.nextLine()));
    }

    public void displayByVersion(Scanner scanner) {
        carView.displayPromptForVersionSearch();
        carView.listCars(carService.getCarsByVersion(scanner.nextLine()));
    }

}
