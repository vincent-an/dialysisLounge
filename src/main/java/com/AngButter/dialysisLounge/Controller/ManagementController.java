package com.AngButter.dialysisLounge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service/management")
@Controller
public class ManagementController {

    @GetMapping("/exercise")
    public String exercise() {
        return "exercise";
    }

    @GetMapping("/byunbie")
    public String byunbie() {
        return "byunbie";
    }

    @GetMapping("/mindcontrol")
    public String mindcontrol() {
        return "mindcontrol";
    }

    @GetMapping("/diary")
    public String diary() {
        return "diary";
    }

    @GetMapping("/pressure")
    public String pressure() {
        return "pressure";
    }

    @GetMapping("/temperature")
    public String temperature() {
        return "temperature";
    }

    @GetMapping("/bpm")
    public String bpm() {
        return "bpm";
    }

    @GetMapping("/weight")
    public String weight() {
        return "weight";
    }

    @GetMapping("/education-magazine1")
    public String educationmagazine1() {
        return "education-magazine1";
    }

    @GetMapping("/education-magazine2")
    public String educationmagazine2() {
        return "education-magazine2";
    }

    @GetMapping("/education-magazine3")
    public String educationmagazine3() {
        return "education-magazine3";
    }

    @GetMapping("/education-magazine4")
    public String educationmagazine4() {
        return "education-magazine4";
    }
}
