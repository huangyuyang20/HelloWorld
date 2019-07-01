package com.scu.hd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check1")
public class CheckController {

    @GetMapping
    public String  check1(){
        return "check1";
    }
}
