package com.avantrip.fizzbuzz;

import com.avantrip.fizzbuzz.manager.FizzBuzzManager;

import java.util.Arrays;

public class ContextMain {

    private FizzBuzzManager manager;
    private Integer[] numbers;

    public ContextMain() {
        numbers = new Integer[] {1, 2, 3, 4, 5, 15};
        manager = new FizzBuzzManager();
    }

    public static void main(String[] args) {
        ContextMain c = new ContextMain();
        c.process();
    }

    public void process() {
        System.out.println(Arrays.toString(manager.execute(numbers)));
    }


}
