/*
Q7> Write a Java program to implement super() keyword without parameter.
 */

class Animal1{
    Animal1()
    {
        System.out.println("This is an Animal");
    }
}

class Cat extends Animal1{
    Cat()
    {
        super();
        System.out.println("This is a Cat");
    }
}

public class Question7{
    public static void main(String[] args)
    {
        Cat c1 = new Cat();
    }
}

/*
Output:
This is an Animal
This is a Cat
 */