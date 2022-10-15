/*
Q3> Exception:
 * Case 1 -> Problem without exception handling
 * Case 2 -> Exception created but properly handled
 * Case 3 -> Exception created but not handled
 */

public class Question3_Case1{
    public static void main(String[] args)
    {
        try
        {
            int data = 10 / 2;

            System.out.println(data);
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }

        System.out.println("Rest of the code");
    }
}

/*
Output:
5
Rest of the code
 */