package fr.ccva.pepitlab.config;

import fr.ccva.pepitlab.dto.UserDto;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle (HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler) throws Exception {
        HttpSession session = request.getSession(true);
        if (session.getAttribute("user") == null) {
            session.setAttribute("user", new UserDto());
        }
        return true;
    }
}
