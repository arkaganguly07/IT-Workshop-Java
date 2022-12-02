/*
Java has the following conditional statements:
🎱Use "if" to specify a block of code to be executed, if a specified condition is true
🎱Use "else" to specify a block of code to be executed, if the same condition is false
🎱Use "else if" to specify a new condition to test, if the first condition is false
🎱Use "switch" to specify many alternative blocks of code to be executed
 */

public class Conditionals1 {
    public static void main(String[] args)
    {
        int x = 20;

        if (x < 18)
            System.out.println("You are not old enough.");

        else if (x == 20)
            System.out.println("You are getting there.");

        else
            System.out.println("Congrats!! You are now eligible.");
    }
}

/*
Output:
You are getting there.
 */