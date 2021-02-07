package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;


public class practical10
{
    public static void reverse(int numbers[])
    {
        int j=0,temp;
        while(j<=numbers.length/2)
        {
            temp=numbers[j];
            numbers[j]=numbers[numbers.length-1-j];
            numbers[numbers.length-1-j]=temp;
            j++;
        }
    }
    public static void main(String[] args)
    {
        int i=0;
        int num_array[]=new int[10];
        Scanner input = new Scanner(System.in);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 10");

        for(i=0;i<10;i++)
        {
            System.out.print("Enter number - "+ (i+1) + " : ");
            num_array[i] = input.nextInt();
        }
        reverse(num_array);

        System.out.print("After reversing : ");
        for(i=0;i<10;i++)
        {
            System.out.print(" "+num_array[i]);
        }
    }
}

