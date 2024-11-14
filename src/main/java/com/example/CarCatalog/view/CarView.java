package com.example.CarCatalog.view;

import com.example.CarCatalog.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class CarView {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public void showMenu() {
        System.out.println(CYAN + "===============================================");
        System.out.println(RED + "                🚗 KATALOG AUT 🚗              ");
        System.out.println(CYAN + "===============================================\n");
        System.out.println(RED + "               Wybierz opcję z menu:            ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(YELLOW + "  1. 📜  Wypisz wszystkie auta                   ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(GREEN + "  2. ➕  Dodaj nowe auto                          ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(RED + "  3. ❌  Usuń auto z listy                       ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(BLUE + "  4. 🔍  Wypisz auto o podanym ID                ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(BLUE + "  5. 🔍  Wypisz auta danej marki                  ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(BLUE + "  6. 🔍  Wypisz auta o podanej wersji nadwozia                  ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(WHITE + "  7. 🚪  Wyjdź z programu                        ");
        System.out.println(CYAN + "------------------------------------------------");
        System.out.println(CYAN + "===============================================");
        System.out.print(PURPLE + "   Wybór: " + RESET);
    }


    public void displayCarDetails(Car car) {
        System.out.println(CYAN + "========================================================================================");
        System.out.println(BLUE + "Marka: "+ YELLOW + car.getBrand() + BLUE + " Model: " + YELLOW + car.getModel() + BLUE +"\nWersja: "+ YELLOW + car.getVersion() + BLUE + "\nRocznik: " + YELLOW + car.getYear() + BLUE +"\nPrzebieg: " + YELLOW + car.getMileage() +
        BLUE + "\nKolor: " + YELLOW + car.getColor() + BLUE +"\nMoc: " + YELLOW + car.getPower() + "kM" + BLUE + "\nCena: " + YELLOW + car.getPrice() + "Zl" + BLUE + "\nId pojazdu: " + RED + car.getId() + RESET);
        System.out.println(CYAN + "========================================================================================" + RESET);
    }

    public void listCars(List<Car> cars) {
        for (Car car : cars) {
            displayCarDetails(car);
        }
    }

    public Car addCar(Scanner scanner) {
        System.out.println(PURPLE + "Wprowadz marke: ");
        String brand = scanner.nextLine();
        System.out.println("Wprowadz model: ");
        String model = scanner.next();
        System.out.println("Wprowadz Wersje nadwozia: ");
        String version = scanner.next();
        System.out.println("Wprowadz rocznik: ");
        int year = scanner.nextInt();
        System.out.println("Wprowadz przebieg: ");
        double mileage = scanner.nextDouble();
        System.out.println("Wprowadz moc: ");
        int power = scanner.nextInt();
        System.out.println("Wprowadz kolor: ");
        String color = scanner.next();
        System.out.println("Wprowadz cene: " + RESET);
        double price = scanner.nextDouble();

        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setVersion(version);
        car.setYear(year);
        car.setMileage(mileage);
        car.setPower(power);
        car.setColor(color);
        car.setPrice(price);

        return car; // Zwrócenie obiektu Car do kontrolera
    }

    public void displayCarAdded() {
        System.out.println(GREEN + "Auto dodane!" + RESET);
    }

    public long promptForCarId(Scanner scanner) {
        System.out.println(PURPLE + "Podaj id auta: " + RESET);
        return scanner.nextLong();
    }

    public void displayCarRemoved(long id) {
        System.out.println(GREEN + "Auto o id " + YELLOW + id + GREEN + " zostało " + RED + "usunięte" + GREEN + "." + RESET);
    }

    public void displayCarNotFound(long id) {
        System.out.println(RED + "Auto o id " + YELLOW + id + RED + " nie zostało znalezione." + RESET);
    }

    public void displayInvalidOption() {
        System.out.println(RED + "Wprowadzono nieprawidłowe dane." + RESET);
    }

    public void displayPromptForBrandSearch(){
        System.out.println(PURPLE + "Podaj marke auta, ktore chcesz wyszukac." + RESET);
    }

    public void displayPromptForVersionSearch(){
        System.out.println(PURPLE + "Podaj wersje nadwozia, ktora chcesz wyszukac." + RESET);
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
