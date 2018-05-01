package fr.ccva.pepitlab.service;

import fr.ccva.pepitlab.dto.UserDto;

public interface UserService {
    UserDto doLogin(String email, String password);
}
