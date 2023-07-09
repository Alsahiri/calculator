package com.calculator.calculator;

import com.calculator.calculator.exceptions.InvalidDivisionException;
import org.springframework.stereotype.Service;

@Service

public class CalculateServiceImp implements CalculateService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
//@Override
//    public String checkValidInput(Integer num1, Integer num2) throws InvalidInputException {
//        if (num1 == null || num2 == null) {
//            throw new InvalidInputException("Ошибка! Исходные данные введены неверно!");
//        }
//        return "Ошибка! Исходные данные введены неверно!";
//    }

@Override
    public String plus(int num1, int num2) {
    int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
@Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
@Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
@Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new InvalidDivisionException("Ошибка! На ноль делить нельзя!");
        }
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
