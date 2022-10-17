/*
Q10> Consider a student examination database system, that prints the mark sheet of students. Input the following from
the command line:
 (a)Student's Name
 (b)Marks in 6 subjects

These marks should be among 0 to 50. If the marks are not in the specified range, raise a RangeException, else find the
total marks and print out the percentage of the students.
 */

import java.util.Scanner;

class RangeException extends Exception{}

public class Question10{
    public static void main(String[] args)
    {
        String name;
        int i, j;
        double percentage = 0.0;
        double sum = 0.0;
        int marks[] = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student: ");
        name = sc.nextLine();

        System.out.println("Enter the number of subjects: ");
        j = sc.nextInt();

        try
        {
            int cnt = 0;

            for (i = 0; i < j; ++i)
            {
                System.out.println("Enter the marks of the student: ");
                marks[i] = sc.nextInt();
                ++cnt;

                if (marks[i] < 0)
                    throw new RangeException();

                else if (marks[i] > 50)
                    throw new RangeException();

            }

            for (i = 0; i < j; ++i)
                sum += marks[i];
            
            percentage = sum / 300 * 100;
        }

        catch (RangeException r)
        {
            System.out.println("The marks are not in range");
        }
        
        System.out.println("Total Percentage = " + percentage);
    }
}

/*
Output:
Enter the name of the Student:
Sasuke Uchiha
Enter the number of subjects:
6
Enter the marks of the student:
45
Enter the marks of the student:
43
Enter the marks of the student:
45
Enter the marks of the student:
46
Enter the marks of the student:
47
Enter the marks of the student:
50
Total Percentage = 92.0
 */
