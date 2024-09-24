package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class

        Calculator calc1 = new Calculator("TI-84");
        
        //2. call any methods of that class to test

        double division = calc1.performOperation("/", 4, 2);
        System.out.println(division);
        double multiplication = calc1.performOperation("*", 3, 5);
        System.out.println(multiplication);
        double addition = calc1.performOperation("+", 2, 3);
        System.out.println(addition);
        double subtraction = calc1.performOperation("-", 3, 2);
        System.out.println(subtraction);
        double none = calc1.performOperation("adfasdfasdfasdf", 4, 5);
        System.out.println(none);

        boolean divisibility = calc1.divisibleBy(5, 3);
        System.out.println(divisibility);
        boolean divisibility1 = calc1.divisibleBy(6, 3);
        System.out.println(divisibility1);

        String coordinate = calc1.coordinatePair(3, 5);
        System.out.println(coordinate);

        int absolute = calc1.absoluteValue(1, 2);
        System.out.println(absolute);

        String info = calc1.info();
        System.out.println(info);
    }
}
