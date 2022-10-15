/*
Q8> Finally
 * Case 1 -> 'finally' example where exception doesn't occur
 * Case 2 -> 'finally' example where exception occurs and not handled
 * Case 3 -> 'finally' example where exception occurs and handled
 */

public class Question8_Case3{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside the try() block");
            int data = 25 / 0;

            System.out.println(data);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Exception is handled");
            System.out.println(e);
        }

        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("Rest of the code");
    }
}

/*
Output:
Inside the try() block
Exception is handled
java.lang.ArithmeticException: / by zero
finally block is always executed
Rest of the code
 */