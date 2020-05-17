package com.andrey;

/**
 * AutHor Andrey S
 * <p>
 * data 16.05.2020
 */

public class One {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(++i + ++i + i++ + i);

        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
    }
}