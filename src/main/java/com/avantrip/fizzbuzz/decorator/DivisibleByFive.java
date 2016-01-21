package com.avantrip.fizzbuzz.decorator;

/**
 * Se encarga de ver solamente que el numero sea divisible por 5 y agregar en el StringBuffer el resultado "Buzz" en caso positivo
 */
public class DivisibleByFive extends Decorator {

    @Override
    public void process(StringBuffer sb, Integer n) {
        if(n % 5 == 0) {
            sb.append("Buzz");
        }
    }


}
