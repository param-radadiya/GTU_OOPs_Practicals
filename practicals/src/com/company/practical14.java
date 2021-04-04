package com.company;
import java.util.*;

public class practical14 {

    public static void main(String[] args){

        ArrayList<Object> arr_list = new ArrayList<Object>();
        arr_list.add(new Date());
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 14\n");

        arr_list.add(new Loan(26958));
        arr_list.add(new String("This is Param Radadiya"));
        arr_list.add(new Circle(36.9));
        for (int i = 0; i < arr_list.size(); i++)
        {
            System.out.println((arr_list.get(i)).toString());
        }
    }
}
class Circle
{
    double radius;
    Circle(double r)
    {
        this.radius=r;
    }
    public String toString()
    {
        return "Circle with Radius "+this.radius;
    }
}
class Loan
{
    double amount;
    Loan(double amt)
    {
        this.amount=amt;
    }
    public String toString()
    {
        return "Amount of the = "+this.amount;
    }
}
