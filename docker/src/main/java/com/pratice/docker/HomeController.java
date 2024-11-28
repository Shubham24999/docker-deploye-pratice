package com.pratice.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HomeController {

    @GetMapping("/hi")
    public String getHelloWorld() {
        return "Hello, World!";
    }
    
}
