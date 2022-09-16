package com.fractal.technicaltest.controllers.mainroute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")

public class MainRouteController {

    /* Main route for the welcome page */

    @GetMapping(value="")
    public String welcome() {
        return "Welcome to the backend"; 
    }
        
}
