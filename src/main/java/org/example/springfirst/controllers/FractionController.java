package org.example.springfirst.controllers;

import org.example.springfirst.models.Fraction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fractions")
public class FractionController {

    @GetMapping("/isProper")
    public boolean isProper(@RequestParam int numerator, @RequestParam int denominator) {
        Fraction fraction = new Fraction(numerator, denominator);
        return fraction.isProper();
    }

    @GetMapping("/reduce")
    public Fraction reduce(@RequestParam int numerator, @RequestParam int denominator) {
        Fraction fraction = new Fraction(numerator, denominator);
        return fraction.reduce();
    }

    @GetMapping("/add")
    public Fraction add(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2,
            @RequestParam int den2) {
        Fraction fraction1 = new Fraction(num1, den1);
        Fraction fraction2 = new Fraction(num2, den2);
        return fraction1.add(fraction2);
    }

    @GetMapping("/subtract")
    public Fraction subtract(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2,
            @RequestParam int den2) {
        Fraction fraction1 = new Fraction(num1, den1);
        Fraction fraction2 = new Fraction(num2, den2);
        return fraction1.subtract(fraction2);
    }

    @GetMapping("/multiply")
    public Fraction multiply(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2,
            @RequestParam int den2) {
        Fraction fraction1 = new Fraction(num1, den1);
        Fraction fraction2 = new Fraction(num2, den2);
        return fraction1.multiply(fraction2);
    }

    @GetMapping("/divide")
    public Fraction divide(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2,
            @RequestParam int den2) {
        Fraction fraction1 = new Fraction(num1, den1);
        Fraction fraction2 = new Fraction(num2, den2);
        return fraction1.divide(fraction2);
    }
}
