package pl.jedrus.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String getCar(Model model) {

        model.addAttribute("name", "Daniel");

        return "hello";

    }
}
