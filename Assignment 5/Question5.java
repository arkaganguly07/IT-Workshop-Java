/*
Q5> Write a Java program to implement multiple inheritance using interface.
 */

interface Printable{
    void print();
}

interface Showing{
    void show();
}

public class Question5 implements Printable, Showing{
    public void print()
    {
        System.out.println("Hello");
    }

    public void show()
    {
        System.out.println("Welcome");
    }

    public static void main(String[] args)
    {
        Question5 myObj = new Question5();
        myObj.print();
        myObj.show();
    }
}

/*
Output:
Hello
Welcome
 */