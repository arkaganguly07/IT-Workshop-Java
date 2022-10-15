/*
Q7> Write a Java program to implement the 'throws' keyword.
 */

public class Question7{
    static void demo() throws IllegalAccessException
    {
        System.out.println("Inside demo()");
        throw new IllegalAccessException("assignment");
    }

    public static void main(String[] args)
    {
        try
        {
            demo();
        }

        catch (IllegalAccessException e)
        {
            System.out.println("Inside main()");
        }
    }
}

/*
Output:
Inside demo()
Inside main()
 */