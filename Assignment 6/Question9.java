/*
Q9> Create a user-defined exception named CheckArgument to check the number of arguments passed through the
command line. If the number of arguments is less than 5, throw the Check Argument Exception, else print the addition of
all the five numbers.
 */

import java.util.Scanner;

class CheckArgument extends Exception{}

public class Question9{
    public static void main(String[] args)
    {
        int i, j;
        int ans = 0;
        int s[] = new int[5];

        System.out.println("Enter the no. of elements: ");
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        try
        {
            int cnt = 0;

            for (i = 0; i < j; ++i)
            {
                s[i] = sc.nextInt();
                ++cnt;

                if (j < 5)
                    throw new CheckArgument();

                else if (j > 5)
                    throw new CheckArgument();


            }

            for (i = 0; i < j; ++i)
                ans += s[i];
        }

        catch (CheckArgument m)
        {
            System.out.println("Passed 5 integers");
        }

        System.out.println("Sum = " + ans);
    }
}

/*
Output:
Enter the no. of elements:
5
1 2 3 4 5
Sum = 15
 */