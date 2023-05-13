package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculateService calculateService;

    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String welcome() {
        return calculateService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
//        if ("num1" == "" || "num2" == "") {
//            return "Ошибка! Неверно введенные значения! Пожалуйста, проверьте!";
//        }
        return calculateService.plus(number1, number2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.minus(number1, number2);
    }
        @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.multiply(number1, number2);
    }
        @GetMapping("/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.divide(number1, number2);
    }
}
