package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;

public class practical15 {

    public static int bin2Dec(String binaryString) throws NumberFormatException
    {
        int decimal = 0;
        int strLength=binaryString.length();
        for (int i = 0; i < strLength; i++)
        {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
            {
                throw new NumberFormatException("The Input String is not Binary");
            }

            decimal += (binaryString.charAt(i)-'0') * Math.pow(2, strLength-1-i);
        }
        return decimal;
    }

    public static void main(String[] args){
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 15\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Binary Value : ");
        String str = input.nextLine();
        try
        {
            System.out.println("Decimal Value = " + bin2Dec(str));
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
