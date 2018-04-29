package fr.ccva.pepitlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //Page d'accueil
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
