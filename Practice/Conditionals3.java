/*
Short Hand If...Else:
There is also a shorthand if else, which is known as the ternary operator because it consists of three operands.
It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements.

// Code Syntax
variable = (condition) ? expressionTrue :  expressionFalse;
 */

public class Conditionals3 {
    public static void main(String[] args)
    {
        int x = 19;
        String result;

        result = (x < 18) ? "Not eligible." : "Congratulations!!";
        System.out.println(result);
        /*
        if (x < 18)
            System.out.println("Not eligible");

        else
            System.out.println("Congratulations!!")
         */
    }
}

/*
Output:
Congratulations!!
 */