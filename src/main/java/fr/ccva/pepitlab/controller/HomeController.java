package fr.ccva.pepitlab.controller;

import fr.ccva.pepitlab.dto.NewDto;
import fr.ccva.pepitlab.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
public class HomeController extends GlobalController{

    @Autowired
    private NewService newService;

    @ModelAttribute("news")
    public List<NewDto> getNewDto() {
        return newService.listNews();
    }

    //Page d'accueil
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
