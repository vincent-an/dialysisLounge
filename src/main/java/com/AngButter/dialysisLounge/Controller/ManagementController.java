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
}
