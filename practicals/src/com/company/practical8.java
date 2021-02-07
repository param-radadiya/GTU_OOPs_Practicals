package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 8\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        Integer num = input.nextInt();

        System.out.print("Factor of "+num + " is ");
        int i=2;
        while (num!=1){
            while(num%i==0){
                num=num/i;
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
