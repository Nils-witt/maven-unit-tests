package dev.nilswitt;

import org.jetbrains.annotations.NotNull;

public class Calculator {


    public static double calc(double x, double y,@NotNull String operator){

        switch (operator){
            case ("+"):
                return x + y;
            case ("-"):
                return x - y;
            case ("*"):
                return x * y;
            case ("/"):
                return x / y;
            default:
                return 0;
        }
    }
}
