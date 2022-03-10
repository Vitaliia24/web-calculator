package pro.sky.java.course2.webcalculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return num1/num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
}
