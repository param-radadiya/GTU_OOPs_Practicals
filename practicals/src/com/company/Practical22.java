package sample;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Practical22
{
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 22\n");

                Scanner input = new Scanner(System.in);
                int product=1;
                System.out.print("Enter five integers: ");
                int[] list = new int[5];
                for (int i = 0; i < list.length; i++)
                {
                    list[i] = input.nextInt();
                    product *= list[i];
                }
                System.out.println("The Product of elements is " + product);
            }
        }

