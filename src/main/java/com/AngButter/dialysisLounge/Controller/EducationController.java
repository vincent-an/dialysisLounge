package com.AngButter.dialysisLounge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service/education")
public class EducationController {

    @GetMapping("/magazine1")
    public String educationmagazine1() {
        return "education-magazine1";
    }

    @GetMapping("/magazine2")
    public String educationmagazine2() {
        return "education-magazine2";
    }

    @GetMapping("/magazine3")
    public String educationmagazine3() {
        return "education-magazine3";
    }

    @GetMapping("/magazine4")
    public String educationmagazine4() {
        return "education-magazine4";
    }

    @GetMapping("/video1")
    public String educationvideo1() {
        return "education-video1";
    }

    @GetMapping("/video2")
    public String educationvideo2() {
        return "education-video2";
    }

    @GetMapping("/video3")
    public String educationvideo3() {
        return "education-video3";
    }

    @GetMapping("/video4")
    public String educationvideo4() {
        return "education-video4";
    }
}
