package com.java.iot_speaker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/trang-chu")
    public String homePage(){
        return "home";
    }

}
