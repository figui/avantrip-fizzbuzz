package com.avantrip.fizzbuzz.manager;

import com.avantrip.fizzbuzz.decorator.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Su responsabilidad es inicializar los decoradores y llevar la logica del juego.
 */
public class FizzBuzzManager {

    private Decorator decorator;

    public FizzBuzzManager() {
        List<Component> components = new ArrayList<Component>();
        components.add(new DivisibleByThree());
        components.add(new DivisibleByFive());
        components.add(new NonDivisibleByThreeAndFive());

        decorator = new Decorator();
        decorator.setComponents(components);
    }

    public String[] execute(Integer[] params) {
        String[] result = new String[params.length];
        for(int i = 0; i < params.length; i++) {
            StringBuffer sb = new StringBuffer();
            decorator.process(sb, params[i]);
            result[i] = sb.toString();
        }
        return result;
    }
}
