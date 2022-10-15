/*
Q3> Exception:
 * Case 1 -> Problem without exception handling
 * Case 2 -> Exception created but properly handled
 * Case 3 -> Exception created but not handled
 */

public class Question3_Case2{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside try() block");

            int data = 25 / 0;
            System.out.println(data);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Exception handled");
            System.out.println(e);
        }

        System.out.println("Rest of the code");
    }
}

/*
Output:
Inside try() block
Exception handled
java.lang.ArithmeticException: / by zero
Rest of the code
 */