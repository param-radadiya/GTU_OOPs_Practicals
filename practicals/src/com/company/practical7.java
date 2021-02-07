package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class practical7 {
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 7\n");

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int i = 0; i < 4; i++) {
            char digit = (char) (Math.random() * 10 + '0');
            s.append(digit);
        }
        System.out.println("Random vehicle plate number : " + s);

    }
}