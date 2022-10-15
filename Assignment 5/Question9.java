/*
Q9> Implementation of final keyword before variable.
 */
// Commented out code should be written without commenting it out.

public class Question9{
    public static void main(String[] args)
    {
        final int age = 20;

        // age = 45;
        System.out.println("Age: " + age);
    }
}

/*
If "age = 45" is not commented out,
then the output shows an error.

Output (when not commented out):
cannot assign a value to final variable age
    age = 45;
    ^
 */