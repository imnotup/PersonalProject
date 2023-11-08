package com.parctice.demo.MyApp.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String myRestController(){
        return "hello world !";
    }

}
