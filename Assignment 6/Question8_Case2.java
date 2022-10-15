/*
Q8> Finally
 * Case 1 -> 'finally' example where exception doesn't occur
 * Case 2 -> 'finally' example where exception occurs and not handled
 * Case 3 -> 'finally' example where exception occurs and handled
 */

public class Question8_Case2{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside the try() block");
            int data = 25 / 0;

            System.out.println(data);
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("finally is always executed");
        }

        System.out.println("Rest of the code");
    }
}

/*
Output:
Inside the try() block
finally is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Question8_Case2.main(Question8_Case2.java:14)
 */