/*
Java has the following conditional statements:
🎱Use "if" to specify a block of code to be executed, if a specified condition is true
🎱Use "else" to specify a block of code to be executed, if the same condition is false
🎱Use "else if" to specify a new condition to test, if the first condition is false
🎱Use "switch" to specify many alternative blocks of code to be executed
 */

public class Conditionals2 {
    public static void main(String[] args)
    {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Happy Weekends.");
                break; // carries out the task and then breaks the switch case

            case 2:
                System.out.println("Weekdays Again.");
                break;

            default: // if any of the above choices don't match, this will be executed
                System.out.println("Choose something!!");
        }
    }
}

/*
Output:
Weekdays Again.
 */