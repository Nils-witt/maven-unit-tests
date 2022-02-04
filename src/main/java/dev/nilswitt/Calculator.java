package dev.nilswitt;

import org.jetbrains.annotations.NotNull;

public class Calculator {


    public static double calc(double x, double y,@NotNull String operator){

        return switch (operator) {
            case ("+") -> x + y;
            case ("-") -> x - y;
            case ("*") -> x * y;
            case ("/") -> x / y;
            default -> 0;
        };
    }
}
