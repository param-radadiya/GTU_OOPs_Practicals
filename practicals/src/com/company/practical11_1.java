package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;


public class practical11_1 {

    static int N = 6;
    static int[][] m = input(6,6);;
    static Boolean valid = true;
    static int[] rowin = new int[6];
    static int[] colin = new int[6];
    //static int rowin[], colin[];

    public static int[][] input(int row, int columns) {

        enrol();
        Scanner input = new Scanner(System.in);

        int[][] m = new int[row][columns];

        System.out.println("Enter value for 6*6 matrix (only 0-1) : ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        System.out.println();

        return m;
    }

    public static void validators(int[][] m) {
        int sum = 0;
        for(int i=0;i<6;i++)
        {
            for(int j=0; j<6;j++)
            {
                System.out.print(m[i][j]);
                sum = sum + m[i][j];
            }
            System.out.println("");

            if(sum%2==1)
            {
                rowin[i] = 1;
            }
            else{
                valid=false;
                rowin[i]=0;
            }
            sum=0;
        }

        for(int i=0;i<6;i++)
        {
            for(int j=0; j<6;j++)
            {
                sum = sum + m[j][i];
            }

            if(sum%2==1)
            {
                colin[i] = 1;
            }
            else{
                valid=false;
                colin[i]=0;
            }
            sum=0;
        }

    }

    public static void enrol(){

        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 11 (extension-1)\n");
    }


    public static void main(String[] args) {

        validators(m);

        if (valid==true){
            System.out.println("\nThe Array is Valid");
            System.out.println("Every Row and Column has an odd number of 1’s.");
        }

        else {
            System.out.print("The Array is Invalid at the row : ");

            for(int i=0;i<6;i++){
                if(rowin[i]==0){
                    System.out.print(i + " ");
                }
            }

            System.out.print("and at the column :");

            for(int i=0;i<6;i++){
                if(colin[i]==0){
                    System.out.print(i + " ");
                }
            }

        }
    }
}