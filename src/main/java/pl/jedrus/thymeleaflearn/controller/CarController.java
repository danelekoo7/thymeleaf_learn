package pl.jedrus.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jedrus.thymeleaflearn.pojo.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("hello")
    public String get(Model model) {
        Car car1 = new Car("Citigo", "Skoda");
        Car car2 = new Car("tipo", "Fiat");
        Car car3 = new Car("e46", "BMW");
        Car car4 = new Car("golf", "VW");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        model.addAttribute("cars", cars);
        model.addAttribute("car", car1);
        return "car";

    }
}
