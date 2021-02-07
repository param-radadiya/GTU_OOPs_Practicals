package com.company;
import java.time.LocalDateTime;

import java.util.Scanner;

public class practical13 {

    public static boolean validation(char arg[]) {

        char[] ch = new char[3];
        int j=0;

        for(int i=0;i< arg.length;i++){
            if(arg[i]!=' ')
            {
                ch[j++] = arg[i];
            }
        }

        return ch[1] == '+' || ch[1] == '-' || ch[1] == '*' || ch[1] == '/';
    }

    public static void main (String[]args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 13\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        boolean result  = validation(ch);

        if(result)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}