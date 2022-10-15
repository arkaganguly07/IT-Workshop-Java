/*
Q12> Create an interface called 'Player'. The interface has an abstract method called 'play()' that displays a message
describing the meaning of 'play' to the class. Create classes called 'Child', 'Musician', and 'Actor' that all implement
'Player'. Create an application that demonstrates the use of the classes.
 */

interface Player{
    void play();
}

class Child implements Player{
    @Override
    public void play()
    {
        System.out.println("This player is a Child");
    }
}

class Musician implements Player{
    @Override
    public void play()
    {
        System.out.println("This player is a Musician");
    }
}

class Actor implements Player{
    @Override
    public void play()
    {
        System.out.println("This player is an Actor");
    }
}

public class Question12 {
    public static void main(String[] args)
    {
        Child obj1 = new Child();
        Musician obj2 = new Musician();
        Actor obj3 = new Actor();

        obj1.play();
        obj2.play();
        obj3.play();
    }
}

/*
Output:
This player is a Child
This player is a Musician
This player is an Actor
 */