package com.avantrip.fizzbuzz.decorator;

/**
 * Se encarga de ver solamente que el numero no sea divisible por 5 ni por 3 y agregar en el StringBuffer el mismo numero que vino como parametro en caso positivo
 */
public class NonDivisibleByThreeAndFive extends Decorator{

    @Override
    public void process(StringBuffer sb, Integer n) {
        if(n % 5 != 0 && n % 3 != 0) {
            sb.append(n);
        }
    }
}
