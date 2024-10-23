package com.example.CarCatalog.controller;

import com.example.CarCatalog.model.Car;
import com.example.CarCatalog.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Wypisz wszystkie auta");
            System.out.println("2. Dodaj nowe auto");
            System.out.println("3. Usun auto z listy");
            System.out.println("4. Wypisz auto o podanym id");
            System.out.println("5. Wyjdz z programu");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> listCars();
                case 2 -> addCar(scanner);
                case 3 -> deleteCar(scanner);
                case 4 -> listCar(scanner);
                case 5 -> System.exit(0);
                default -> System.out.println("Wprowadzono nieprawidlowy numer");
            }
        }
    }
    private void listCars() {
        carService.getAllCars().forEach(System.out::println);
    }
    private void addCar(Scanner scanner) {
        System.out.println("Wprowadz marke: ");
        String brand = scanner.next();
        System.out.println("Wprowadz model: ");
        String model = scanner.next();
        System.out.println("Wprowadz rocznik: ");
        int year = scanner.nextInt();
        System.out.println("Wprowadz moc: ");
        int power = scanner.nextInt();
        System.out.println("Wprowadz kolor: ");
        String color = scanner.next();
        System.out.println("Wprowadz cene: ");
        double price = scanner.nextDouble();

        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setYear(year);
        car.setPower(power);
        car.setColor(color);
        car.setPrice(price);

        carService.saveCar(car);
        System.out.println("Auto dodane!");
    }
    private void deleteCar(Scanner scanner) {
        System.out.println("Wprowadz id pojazdu ktory chcesz usunac: ");
        long id = scanner.nextInt();
        carService.deleteCar(id);
        System.out.println("Auto usuniete!");
    }

    private void listCar(Scanner scanner) {
        System.out.println("Podaj id auta ktore chcesz wyswietlic: ");
        Long id = scanner.nextLong();
        System.out.println(carService.getCarById(id));
    }
}
