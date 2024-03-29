package com.gymapp.controller.auth;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AutenticacionController {

    @GetMapping("/login")
    public String login(Model model) {
        return "/autenticacion/login";
    }

    @GetMapping("/registro")
    public String registro(Model model) {
        return "/autenticacion/registro";
    }

}
