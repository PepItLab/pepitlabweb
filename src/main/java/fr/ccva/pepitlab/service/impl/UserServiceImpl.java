package fr.ccva.pepitlab.service.impl;

import fr.ccva.pepitlab.dao.UserDao;
import fr.ccva.pepitlab.dto.UserDto;
import fr.ccva.pepitlab.model.Password;
import fr.ccva.pepitlab.model.User;
import fr.ccva.pepitlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public UserDto doLogin(String email, String password) {
        User user = this.userDao.getByEmail(email);

        if(user != null) {
            if(Password.checkPassword(password, user.getPassword())) {
                UserDto userDto = new UserDto();
                userDto.setLogged(true);

                return userDto;
            }
        }
        return null;
    }
}
