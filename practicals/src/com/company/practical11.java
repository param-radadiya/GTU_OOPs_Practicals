package com.company;

import java.util.Scanner;


public class practical11 {

    static int N = 6;
    static int[][] m = input(6,6);
    static Boolean status = false;
    static int[] invalidr = {0};
    static int[] invalidc = {0};
    public static int i=0;
    public static int j=0;

    public static int[][] input(int row, int columns) {

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

    public static boolean validators(int[][] m) {

        for (int i = 0; i < N; i++) {
            status = checkOdd(m , i, N, true);
            if (status==false)
                break;
        }

        for (int j = 0; j < N; j++) {    //iterate over columns
            status = checkOdd(m, j, N, false);
            if (status==false)
                break;
        }
        return (status);
    }

    private static Boolean checkOdd(int[][] a, int s, int e, Boolean f) {
        boolean b = true;
        int t=0;

        if (f) {
            int sum=0;
            for(t=0;t<e;t++) {    //iterate over column
                sum+=a[s][t];
            }
            if(sum%2 == 0) {
                invalidr[i++] = sum;
                b = false;
            }
            else
                b=true;
        }
        else {
            int sum=0;
            for(t=0;t<e;t++) {    //iterate over row
                sum+=a[t][s];
            }
            if(sum%2 == 0) {
                invalidc[j++] = sum;
                b = false;
            }
            else
                b=true;
        }
        return (b);
    }

    public static void display(int[][] m) {

        System.out.println("Entered Matrix is ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        display(m);

        boolean output_status;
        output_status = validators(m);

        if (output_status){
            System.out.println("\nThe Array is : Valid");
            System.out.println(i + " " + j);
            System.out.println("Every Row and Column has an odd number of 1’s.");
        }

        else {
            System.out.println("The Array is : Invalid");
            System.out.println(i + " " + j);
            System.out.print("The array is Invalid at the row: ");

            System.out.print("and at the column: ");
                }
            }
}