package com.company;

class sample
{
    String expression="3+4";     //aa+b, abq123 * pqr23, x + y - z, etc.
    Boolean isValidateExpression(String exp)
    {
        Boolean status=true;
        String c="", temp="", operator="", oprn1="",oprn2="";
        int i=0;
        exp=exp.trim();

        //for(int i=0; i<exp.length(); i++)
        //{

        while(!isOperator(c=exp.substring(i,i+1)))
        {
            if (" ".equals(c) | "\t".equals(c))
                break;
            oprn1=oprn1+c;
            i++;
        }
        System.out.println("Operand-1 : " + oprn1);
        c=exp.substring(i,i+1);
        if(isOperator(c)) {
            operator = c;
            i++;
        }

        System.out.println("Operator : " + operator);

        while(i < exp.length())
        {
            c=exp.substring(i,i+1);
            if (" ".equals(c) | " ".equals("\t"))
                break;
            oprn2=oprn2+c;
            i++;
        }
        System.out.println("Operand-2 : " + oprn2);

        if(!oprn1.isEmpty() && !operator.isEmpty() && !oprn2.isEmpty())
            return(true);
        else
            return(false);
    }

    Boolean isOperator(String s)
    {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("\\") || s.equals("%"))
            return(true);
        else
            return(false);
    }

    public static void main(String [] args)
    {
        sample obj = new sample();
        Boolean v = obj.isValidateExpression(args[0]);
        if(v)
            System.out.println("Valid");
        else
            System.out.println("InValid");
    }
}
