package com.k8.webservicechassis.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @GetMapping
    @ResponseBody
    public String getGreeting() {
        return "success: web service online.";
    }

}
