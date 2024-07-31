package com.AngButter.dialysisLounge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service/diet")
@Controller
public class DietController {

    @GetMapping("/recipe")
    private String recipeMain() {
        return "recipe";
    }

    @GetMapping("/recipe-m1")
    private String recipe_m1() {
        return "recipe-m1";
    }

    @GetMapping("/recipe-c1")
    private String recipe_c1() {
        return "recipe-c1";
    }

    @GetMapping("/recipe-m2")
    private String recipe_m2() {
        return "recipe-m2";
    }

    @GetMapping("/recipe-c2")
    private String recipe_c2() {
        return "recipe-c2";
    }

    @GetMapping("/recipe-m3")
    private String recipe_m3() {
        return "recipe-m3";
    }

    @GetMapping("/recipe-c3")
    private String recipe_c3() {
        return "recipe-c3";
    }

    @GetMapping("/recipe-m4")
    private String recipe_m4() {
        return "recipe-m4";
    }

    @GetMapping("/recipe-c4")
    private String recipe_c4() {
        return "recipe-c4";
    }

    @GetMapping("/recipe-m5")
    private String recipe_m5() {
        return "recipe-m5";
    }

    @GetMapping("/recipe-c5")
    private String recipe_c5() {
        return "recipe-c5";
    }

    @GetMapping("/recipe-m6")
    private String recipe_m6() {
        return "recipe-m6";
    }

    @GetMapping("/recipe-c6")
    private String recipe_c6() {
        return "recipe-c6";
    }
}
