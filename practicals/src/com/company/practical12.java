package com.company;
import java.time.LocalDateTime;

public class practical12 {

        int seed=0, n=0;
        int numbers[]= new int[1000];
        practical12(int seed)
        {
            this.seed = seed;
            for(int i=0;i<1000;i++)
            {
                int num = (int) (Math.random()*1000);
                numbers[i]=num;
            }
        }

     int nextInt(int n)
        {
            return(numbers[n]);
        }


    public static void main(String [] args)
        {
            practical12 r = new practical12 (1000);
            int i=0, k=0;

            LocalDateTime t1 = LocalDateTime.now();
            System.out.println(t1);
            System.out.println("190130107118 Param Radadiya 4CEB2");
            System.out.println("Practical - 12\n");

            while(i<100) {
                if (r.nextInt(k)>= 1 && r.nextInt(k)<=49){
                    System.out.println("The random number " + (i + 1) + " : " + r.nextInt(k));
                    i++;
                }
                else
                    {

                    }
                k++;
            }
        }
}