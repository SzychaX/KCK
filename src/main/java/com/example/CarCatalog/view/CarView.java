package com.example.CarCatalog.view;

import com.example.CarCatalog.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class CarView {

    public void showMenu() {
        System.out.println("===============================================");
        System.out.println("                🚗 KATALOG AUT 🚗              ");
        System.out.println("===============================================\n");
        System.out.println("               Wybierz opcję z menu:            ");
        System.out.println("------------------------------------------------");
        System.out.println("  1. 📜  Wypisz wszystkie auta                   ");
        System.out.println("------------------------------------------------");
        System.out.println("  2. ➕  Dodaj nowe auto                          ");
        System.out.println("------------------------------------------------");
        System.out.println("  3. ❌  Usuń auto z listy                       ");
        System.out.println("------------------------------------------------");
        System.out.println("  4. 🔍  Wypisz auto o podanym ID                ");
        System.out.println("------------------------------------------------");
        System.out.println("  5. 🔍  Wypisz auta danej marki                  ");
        System.out.println("------------------------------------------------");
        System.out.println("  6. 🚪  Wyjdź z programu                        ");
        System.out.println("------------------------------------------------");
        System.out.println("===============================================");
        System.out.print("   Wybór: ");
    }


    public void displayCarDetails(Car car) {
        System.out.println("========================================================================================");
        System.out.println("Marka: " + car.getBrand() + " Model: " + car.getModel() + "\nRocznik: " + car.getYear() + "\nPrzebieg: " + car.getMileage() +
                "\nKolor: " + car.getColor() + "\nMoc: " + car.getPower() + "kM" + "\nCena: " + car.getPrice() + "Zl" + "\nId pojazdu: " + car.getId());
        System.out.println("========================================================================================");
    }

    public void listCars(List<Car> cars) {
        for (Car car : cars) {
            displayCarDetails(car);
        }
    }

    public Car addCar(Scanner scanner) {
        System.out.println("Wprowadz marke: ");
        String brand = scanner.next();
        System.out.println("Wprowadz model: ");
        String model = scanner.next();
        System.out.println("Wprowadz rocznik: ");
        int year = scanner.nextInt();
        System.out.println("Wprowadz przebieg: ");
        double mileage = scanner.nextDouble();
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
        car.setMileage(mileage);
        car.setPower(power);
        car.setColor(color);
        car.setPrice(price);

        return car; // Zwrócenie obiektu Car do kontrolera
    }

    public void displayCarAdded() {
        System.out.println("Auto dodane!");
    }

    public long promptForCarId(Scanner scanner) {
        System.out.println("Podaj id auta: ");
        return scanner.nextLong();
    }

    public void displayCarRemoved(long id) {
        System.out.println("Auto o id " + id + " zostało usunięte.");
    }

    public void displayCarNotFound(long id) {
        System.out.println("Auto o id " + id + " nie zostało znalezione.");
    }

    public void displayInvalidOption() {
        System.out.println("Wprowadzono nieprawidłowe dane.");
    }

    public void displayPromptForBrandSearch(){
        System.out.println("Podaj marke auta, ktore chcesz wyszukac.");
    }

    public void displayCarBrand(String brand) {
        if (brand.equals("Audi"))
        {
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⣀⣴⣶⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⣴⣶⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⣴⣶⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⣀⣴⣶⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀");
                    System.out.println("⠀⠀⣠⣾⣿⡿⠛⠉⠁⠀⠀⠀⠀⠉⠛⣿⣿⣿⣿⠛⠉⠁⠀⠀⠀⠀⠉⠛⣿⣿⣿⣿⠛⠉⠁⠀⠀⠀⠀⠉⠛⣿⣿⣿⣿⠛⠉⠁⠀⠀⠀⠉⠛⢿⣿⣷⣄⠀⠀");
                    System.out.println("⠀⣰⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⣴⣿⡿⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⣰⣿⡿⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀    ⠙⢿⣿⣧⠀");
                    System.out.println("⢰⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠁⠈⢿⣿⣇⠀⠀⠀⠀⢰⣿⣿⠁⠈⢿⣿⣇⠀⠀⠀⠀⢰⣿⣿⠁ ⠈⢿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀   ⠈⢿⣿⣇");
                    System.out.println("⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⣿⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀ ⣿⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⢸⣿⣿");
                    System.out.println("⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⣿⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀ ⣿⣿⡇⠀⠀ ⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⢸⣿⣿");
                    System.out.println("⠸⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⡀⠀⣾⣿⡏⠀⠀⠀⠀⠀⢸⣿⣿⡀⢀⣾⣿⡏⠀⠀⠀⠀⠸⣿⣿⡀⠀ ⣾⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⣾⣿⡏");
                    System.out.println("⠀⠻⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣷⣾⣿⡟⠀⠀⠀⠀⠀⠀⠀⠻⣿⣷⣾⣿⡟⠀⠀⠀⠀⠀⠀⠀⠻⣿⣷⣾⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀    ⢠⣾⣿⡟⠀");
                    System.out.println("⠀⠀⠙⢿⣿⣷⣤⣀⠀⠀⠀⠀⠀⣀⣠⣿⣿⣿⣿⣤⣀⠀⠀⠀⠀⠀⣀⣠⣿⣿⣿⣿⣤⣀⠀⠀⠀⠀⠀⣀⣠⣿⣿⣿⣿⣀⠀⠀⠀⠀⠀    ⣾⣿⡿⠋⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠉⠻⢿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀");
        }
        else if (brand.equals("Ford"))
        {
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠤⠤⠤⠤⠤⠤⠤⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⢀⣠⡤⢖⣛⣭⣽⣶⠶⠾⠛⠻⠿⠿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣯⣭⣗⡲⢤⣀⠀⠀⠀⠀");
            System.out.println("⠀⣠⢖⣿⣷⣿⣿⣿⣿⡟⢡⣾⢿⣿⡿⣯⢶⣶⣤⣤⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⡲⣄⠀");
            System.out.println("⣾⢳⣿⣿⣿⣿⣿⣿⣿⣷⣄⣤⣾⠋⣸⣿⣩⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢃⣼⣿⣿⣿⣿⣿⡎⢧");
            System.out.println("⣿⡸⣿⣿⣿⣿⣿⡟⣰⣿⣿⡿⢁⣼⠟⣱⣾⠉⣫⡆⠈⣄⡽⢋⣴⡎⢡⣾⣿⣿⣿⣿⣿⣿⢇⡾");
            System.out.println("⠈⠻⣿⣿⢿⣿⣿⣇⠙⠛⢋⣠⣾⣯⡀⠿⢋⣴⡟⣠⣷⣭⡆⠺⢟⠀⢾⣯⣿⣿⣿⡿⣿⡿⠟⠁");
            System.out.println("⠀⠀⠀⠉⠛⠾⣭⣟⣻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠿⣟⣛⣭⠷⠛⠉⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠒⠒⠚⠻⠿⠿⠿⠿⠿⠿⠟⠛⠛⠒⠒⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀");
        }
        else if (brand.equals("BMW"))
        {
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⠶⢶⡶⠶⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⠀⡸⢇⠀⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⣴⢏⡉⠻⢿⣿⣿⣿⠤⠧⠼⠤⣿⣿⣿⣿⠟⢩⠿⣦⠀⠀⠀");
            System.out.println("⠀⢀⣾⣅⠘⢡⠆⡴⠛⢉⣠⣤⣶⠀⠀⠀⠉⠛⢯⣠⠔⠠⠚⣷⡀⠀");
            System.out.println("⠀⣾⣿⣿⣷⣦⡞⢀⣴⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢻⣤⣶⣿⣿⣷⠀");
            System.out.println("⢠⣿⣿⣿⣿⡟⠀⣾⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⡄");
            System.out.println("⢸⣿⣿⣿⣿⡇⠘⠛⠛⠛⠛⠛⠛⣤⣤⣤⣤⣤⣤⡄⢸⣿⣿⣿⣿⡇");
            System.out.println("⠘⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡿⠀⣼⣿⣿⣿⣿⠃");
            System.out.println("⠀⢿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠟⠁⣼⣿⣿⣿⣿⡿⠀");
            System.out.println("⠀⠈⢿⣿⣿⣿⣿⣷⣤⣀⠀⠀⠀⠿⠛⠋⣁⣤⣾⣿⣿⣿⣿⡿⠁⠀");
            System.out.println("⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠿⠿⠿⠿⠿⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀");
        }
        else if (brand.equals("Opel"))
        {
                    System.out.println("                       _ ");
                    System.out.println("                      | |");
                    System.out.println("  ___  _ __     ___   | |");
                    System.out.println(" / _ \\| '_ \\ / _ \\ |");
                    System.out.println("| (_) | |_) |  __/    | |__");
                    System.out.println(" \\___/| .__/ \\___   |____|");
                    System.out.println("      | |           ");
                    System.out.println("      |_|           ");
        }
    }
}
