/*
Q6> Write a Java program to implement super keyword in Java.
 */

class Animal{
    public void display()
    {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal{
    @Override
    public void display()
    {
        System.out.println("This is a Dog");
    }

    public void printMessage()
    {
        display();
        super.display();
    }
}

public class Question6{
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        obj.printMessage();
    }
}

/*
Output:
This is a Dog
This is an animal
 */
