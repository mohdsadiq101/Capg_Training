package com.cg.controller;

import com.cg.entity.Login;
import com.cg.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService service;

    @PostMapping("/login")
    public String login(@RequestBody Login login, HttpSession session){
        Login l = service.validateUser(login);
        if (l != null){
            session.setAttribute("name", login.getId());
            return "Login Success";
        } else {
            return "Login Failed";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        if (session.getAttribute("name") != null){
            session.invalidate();
        }
        return "Logged Out";
    }
}
