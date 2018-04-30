package fr.ccva.pepitlab.controller;

import fr.ccva.pepitlab.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private NewService newService;

    //Page d'accueil
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("news", newService.listNews());

        return "home";
    }
}
