/*
Q8> Write a Java program to implement super() keyword with parameter.
 */

class Animal2{
    Animal2()
    {
        System.out.println("This is an Animal");
    }

    Animal2(String type)
    {
        System.out.println("Type: " + type);
    }
}

class Tiger extends Animal2{
    Tiger()
    {
        super("Animal");
        System.out.println("This is a Tiger");
    }
}

public class Question8{
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger();
    }
}

/*
Output:
Type: Animal
This is a Tiger
 */