package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class practical4
{
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 4\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (in pounds) : ");
        Float W = sc.nextFloat();

        System.out.print("Enter Height (in inches) : ");
        Float H = sc.nextFloat();

        W = (float) (0.4536 * W);
        H = (float) (H * 0.0254);

        float BMI = W/(H * H);

        System.out.println("Body Mass Index is " + BMI);
    }
}