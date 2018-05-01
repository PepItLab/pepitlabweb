package fr.ccva.pepitlab.controller;

import fr.ccva.pepitlab.dto.UserDto;
import fr.ccva.pepitlab.model.Password;
import fr.ccva.pepitlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
@SessionAttributes(names = {"user"})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getLoginForm(ModelMap modelMap) {
        modelMap.addAttribute("user", new UserDto());
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute("user") UserDto user) {
        UserDto userDto = this.userService.doLogin(user.getEmail(), user.getPassword());

        if(userDto.isLogged()) {
            user.setLogged(true);
        }

        return "redirect:/";
    }
}
