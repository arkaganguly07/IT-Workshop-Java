/*
Q3> Write a Java program to implement multiple inheritance with the help of interface.
 */

interface Add_Sub{
    public void add(double x, double y);
    public void subtract(double x, double y);
}

interface Mul_Div{
    public void multiply(double x, double y);
    public void divide(double x, double y);
}

interface Calculator extends Add_Sub, Mul_Div{
    public void printResult(double result);
}

public class Question3 implements Calculator{
    public void add(double x, double y)
    {
        double result = x + y;
        printResult(result);
    }

    public void subtract(double x, double y)
    {
        double result = x - y;
        printResult(result);
    }

    public void multiply(double x, double y)
    {
        double result = x * y;
        printResult(result);
    }

    public void divide(double x, double y)
    {
        double result = x / y;
        printResult(result);
    }

    public void printResult(double result)
    {
        System.out.println("The result is " + result);
    }

    public static void main(String[] args)
    {
        Question3 c = new Question3();
        c.add(5, 10);
        c.subtract(35, 15);
        c.multiply(6, 9);
        c.divide(45, 6);
    }
}

/*
Output:
The result is 15.0
The result is 20.0
The result is 54.0
The result is 7.5
 */