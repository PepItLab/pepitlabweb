package fr.ccva.pepitlab.controller;

import fr.ccva.pepitlab.dto.NewDto;
import fr.ccva.pepitlab.dto.UserDto;
import fr.ccva.pepitlab.model.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes(names = {"user"})
public class GlobalController {

    @ModelAttribute("user")
    public UserDto getUser() {
        return new UserDto();
    }

    @ModelAttribute("isLogged")
    public boolean isLogged(@SessionAttribute("user") UserDto user) {
        return user.isLogged();
    }
}
