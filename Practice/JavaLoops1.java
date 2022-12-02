/*
Loops can execute a block of code as long as a specified condition is reached. Loops are handy because they save time, reduce errors, and they make code more readable.

✔Java While Loop:
The "while loop" loops through a block of code as long as a specified condition is true:
    // Code Syntax
    while (condition) {
      // code block to be executed
    }

✔The Do/While Loop:
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
    // Code Syntax
    do {
      // code block to be executed
    } while (condition);

✔Java For Loop:
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop.
    // Code Syntax
    for (statement 1; statement 2; statement 3) {
      // code block to be executed
    }

🎱Statement 1 is executed (one time) before the execution of the code block.
🎱Statement 2 defines the condition for executing the code block.
🎱Statement 3 is executed (every time) after the code block has been executed.

✔Java For-Each Loop:
There is also a "for-each" loop, which is used exclusively to loop through elements in an array.
    // Code Syntax
    for (datatype variableName : arrayName) {
      // code block to be executed
    }
 */

public class JavaLoops1 {
    public static void main(String[] args)
    {
        int x = 1;
        String[] cars = {"Volvo", "BMW", "Mercedes-Benz", "Audi"}; // Array Declaration

        System.out.println("Performing While Loop..");
        while (x < 6)
        {
            System.out.println("Number = " + x);
            ++x;
        }

        System.out.println("\nPerforming Do/While Loop..");
        do
        {
            System.out.println("Number = " + x);
            ++x;
        } while (x < 6);

        System.out.println("\nPerforming For Loop..");
        for (int i = 1; i < 6; ++i)
            System.out.println("Number = " + i);

        System.out.println("\nPerforming For-Each Loop");
        for (String a : cars)
            System.out.println(a);
    }
}

/*
Output:
Performing While Loop..
Number = 1
Number = 2
Number = 3
Number = 4
Number = 5

Performing Do/While Loop..
Number = 6

Performing For Loop..
Number = 1
Number = 2
Number = 3
Number = 4
Number = 5

Performing For-Each Loop
Volvo
BMW
Mercedes-Benz
Audi
 */