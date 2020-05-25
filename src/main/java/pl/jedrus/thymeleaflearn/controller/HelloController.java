package pl.jedrus.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jedrus.thymeleaflearn.pojo.Car;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String get(Model model) {

        Car car = new Car("Citigo","Skoda");

        model.addAttribute("name", "Daniel");
        model.addAttribute("car", car);
        return "hello";

    }
}
