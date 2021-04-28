package com.pw.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String returnIndex(){
        return "index";
    }

    @GetMapping("/portfolio")
    public String returnPortfolio() {return "portfolio";}


}
