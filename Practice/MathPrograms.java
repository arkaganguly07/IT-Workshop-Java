/*
The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

✔"Math.max(x, y)" - The "Math.max(x,y)" method can be used to find the highest value of x and y.
✔"Math.min(x, y)" - The "Math.min(x,y)" method can be used to find the lowest value of x and y.
✔"Math.sqrt(x)"   - The "Math.sqrt(x)" method returns the square root of x.
✔"Math.abs(x)"    - The "Math.abs(x)" method returns the absolute (positive) value of x.
✔"Math.random()"  - The "Math.random()" returns a random number between 0.0 (inclusive), and 1.0 (exclusive).
 */

public class MathPrograms {
    public static void main(String[] args)
    {
        int x = 16, y = 5, z = -45;

        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println((int) Math.sqrt(x)); // "Math.sqrt(x)" gives a double type value, so we are type-casting the value to int
        System.out.println(Math.abs(z));
        System.out.println(Math.random());
    }
}

/*
Output:
16
5
4
45
0.954672915820547
 */