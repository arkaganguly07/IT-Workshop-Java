/*
Q4> Write a Java program to implement Java Multi catch block.
 */

import java.util.Scanner;

public class Question4{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        try
        {
            int n = Integer.parseInt(scn.nextLine());

            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        }

        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }

        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }
    }
}

/*
Output:
0
Arithmetic java.lang.ArithmeticException: / by zero
 */