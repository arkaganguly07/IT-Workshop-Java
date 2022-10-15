/*
Q6> Write a Java program to implement the 'throw' keyword.
 */

public class Question6{
    static void demo()
    {
        try
        {
            throw new NullPointerException("assignment");
        }

        catch (NullPointerException e)
        {
            System.out.println("Caught inside demo()");
            throw e;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            demo();
        }

        catch (NullPointerException e)
        {
            System.out.println("Caught inside main");
        }
    }
}

/*
Output:
Caught inside demo()
Caught inside main
 */