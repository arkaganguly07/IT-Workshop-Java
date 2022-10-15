/*
Q1> Write a Java program to implement the abstraction property.
 */

abstract class Shape{
    String colour;

    abstract double area();
    public abstract String toString();

    public Shape(String colour)
    {
        System.out.println("Shape constructor called");
        this.colour = colour;
    }

    public String getColour() {return colour;}
}

class Circle extends Shape{
    double radius;

    public Circle(String colour, double radius)
    {
        super(colour);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle colour is " + super.getColour() + " and area is " + area();
    }
}

public class Question1{
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        System.out.println(s1.toString());
    }
}

/*
Output:
Shape constructor called
Circle constructor called
Circle colour is Red and area is 15.20530
 */
