package com.example.inperial;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InperialCalculatorController {
    InperialCalculator e = new InperialCalculator();

    @RequestMapping("/cm")
    public double cm(@RequestParam int a) {
        return e.cm(a);
    }

    @RequestMapping("/cm")
    public double m(@RequestParam int a) {
        return e.m(a);
    }
}

