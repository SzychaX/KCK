package com.example.CarCatalog.controller;

import com.example.CarCatalog.model.Car;
import com.example.CarCatalog.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class WebCarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String listCars(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "carList"; // Nazwa szablonu HTML
    }

    @GetMapping("/add")
    public String showAddCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "addCar"; // Nazwa szablonu do dodawania samochodu
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute Car car) {
        carService.addCar(car);
        return "redirect:/cars"; // Przekierowanie po dodaniu samochodu
    }
}
