package com.example.Glab._951.testController;

import com.example.Glab._951.model.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class UserController {

    @PostMapping(value = "/users", consumes = {"application/json"})
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:"+user);
    }
}

