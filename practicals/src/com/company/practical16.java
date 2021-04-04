package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;

public class practical16 {

    public static void main(String args[])
    {
        LocalDateTime t1=LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 16\n");

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a decimal number : ");
        String[] str=input.nextLine().split("\\.");

        System.out.println("Integer part: "+str[0]);
        System.out.println("Fractional Part: "+str[1]);
    }
}