/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.gymapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Fio
 */
@Controller
public class VideoFlexibilidadController {
    
    @RequestMapping("/video_flexibilidad")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "video_flexibilidad";
    }
    
}