package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/test")
public class HomeController {

    private static String HOME = "home";
    private static String FAISAL = "faisal";
    private static String ELISHA = "elisha";

    //Action
    @GetMapping()
    public String home() {
        return HOME;

    }

    @GetMapping("/faisal")
    public String Faisal(){
        return FAISAL;
    }

    @GetMapping("/elisha")
        public String elisha(){;
        return ELISHA;
    }
}
