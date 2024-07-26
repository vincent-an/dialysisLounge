package com.AngButter.dialysisLounge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service")
@Controller
public class ServiceController {

    @GetMapping("/management")
    public String management() {
        return "lifeManagement";
    }

    @GetMapping("/emergency")
    public String emergency() {
        return "emergency";
    }

    @GetMapping("/education-magazine")
    public String educationmagazine() {
        return "education-magazine";
    }

    @GetMapping("/map")
    public String map() {
        return "map";
    }
}
