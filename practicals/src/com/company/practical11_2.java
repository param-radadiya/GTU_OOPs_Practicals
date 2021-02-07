package com.company;
import java.time.LocalDateTime;
import java.util.*;

public class practical11_2 {

    static String[] num;
    static String turn;


    static String result()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = num[0] + num[1] + num[2];
                    break;
                case 1:
                    line = num[3] + num[4] + num[5];
                    break;
                case 2:
                    line = num[6] + num[7] + num[8];
                    break;
                case 3:
                    line = num[0] + num[3] + num[6];
                    break;
                case 4:
                    line = num[1] + num[4] + num[7];
                    break;
                case 5:
                    line = num[2] + num[5] + num[8];
                    break;
                case 6:
                    line = num[0] + num[4] + num[8];
                    break;
                case 7:
                    line = num[2] + num[4] + num[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            }

            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(num).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }


    static void printnum()
    {
        System.out.println("| " + num[0] + " | "+ num[1] + " | " + num[2]+ " |");
        System.out.println(" ----------- ");
        System.out.println("| " + num[3] + " | "+ num[4] + " | " + num[5]+ " |");
        System.out.println(" ----------- ");
        System.out.println("| " + num[6] + " | "+ num[7] + " | " + num[8]+ " |");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        num = new String[9];
        turn = "X";
        String winner = null;

        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 11 (extension-2)\n");

        for (int a = 0; a < 9; a++) {
            num[a] = String.valueOf(a + 1);
        }

        printnum();

        System.out.println("\nPlayer-1 is X");
        System.out.println("Player-2 is 0");

        System.out.println("\nEnter a slot number to place X at : ");

        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "\tInvalid input..... \n\tRe-enter slot number : ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\tInvalid input..... \n\tre-enter slot number:");
                continue;
            }


            if (num[numInput - 1].equals(
                    String.valueOf(numInput))) {
                num[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printnum();
                winner = result();
            }
            else {
                System.out.println("Slot already taken..... \nre-enter slot number:");
            }
        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("\n\nIt's a draw! \n\tThanks for playing.");
        }

        else {
            System.out.println("\n\tCongratulations! " + winner+ " have won the game... \n\tThanks for playing.");
        }
    }
}
