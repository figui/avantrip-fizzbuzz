package com.avantrip.fizzbuzz.decorator;

/**
 * * Se encarga de ver solamente que el numero sea divisible por 3 y agregar en el StringBuffer el resultado "Fizz" en caso positivo
 */
public class DivisibleByThree extends Decorator{

    @Override
    public void process(StringBuffer sb, Integer n) {
        if(n % 3 == 0) {
            sb.append("Fizz");
        }
    }
}
