package com.example.Glab._951.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")

public class MyController {
    @RequestMapping({"/login"})   // either type '/' or index
    public String showlogin()
    {
        return "inboxpage";
    }
    @RequestMapping("/")
    public String simplemethod() {
        //mapped to hostname:port/home/
        return "inboxpage";
    }
    @RequestMapping("/index")
    public String showindex() {
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }
    @RequestMapping("/2nd")
    public String show2nd() {
        //mapped to hostname:port/home/index/
        return "secondinbox";
    }

}
