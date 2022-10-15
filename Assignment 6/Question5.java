/*
Q5> Write a Java program to implement Java Nested try method.
 */

public class Question5{
    public static void main(String[] args)
    {
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[5]);
            try
            {
                int x = a[2] / 0;
            }

            catch (ArithmeticException e2)
            {
                System.out.println("Division by zero is not possible");
            }
        }

        catch (ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array index out of bounds");
            System.out.println("Element at such index does not exist");
        }
    }
}

/*
Output:
Array index out of bounds
Element at such index does not exist
 */