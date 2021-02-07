package com.company;

import java.time.LocalDateTime;

public class practical2 {

    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 2\n");
        double a=3.4,b=50.2,e=44.5,c=2.1,d=0.55,f=5.9,x=0,y=0;
        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x="+x +"\ny="+ y);

    }
}
