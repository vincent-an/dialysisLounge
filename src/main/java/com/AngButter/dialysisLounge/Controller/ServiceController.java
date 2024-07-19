package com.AngButter.dialysisLounge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service")
@Controller
public class ServiceController {

    @GetMapping("/management")
    public String Management() {
        return "lifeManagement";
    }
}
