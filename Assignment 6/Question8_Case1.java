/*
Q8> Finally
 * Case 1 -> 'finally' example where exception doesn't occur
 * Case 2 -> 'finally' example where exception occurs and not handled
 * Case 3 -> 'finally' example where exception occurs and handled
 */

public class Question8_Case1{
    public static void main(String[] args)
    {
        try
        {
            int data = 25 / 5;
            System.out.println(data);
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Rest of the code");
    }
}

/*
Output:
5
Finally block is always executed
Rest of the code
 */