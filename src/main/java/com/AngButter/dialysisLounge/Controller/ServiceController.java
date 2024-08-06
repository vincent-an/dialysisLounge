package com.AngButter.dialysisLounge.Controller;

import com.AngButter.dialysisLounge.Address;
import com.AngButter.dialysisLounge.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
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

    @GetMapping("/magazine")
    public String educationmagazine() {
        return "education-magazine";
    }

    @GetMapping("/video")
    public String educationvideo() {
        return "education-video";
    }

    @GetMapping("/map")
    public String map() {
        return "map";
    }

    @GetMapping("/diet")
    public String diet() {
        return "diet";
    }
}
