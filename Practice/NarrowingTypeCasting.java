/*
Narrowing Casting: Narrowing casting must be done manually by placing the type in parentheses in front of the value.
 */

public class NarrowingTypeCasting {
    public static void main(String[] args)
    {
        int x = 454;
        float y = (float) x; // Manual Casting (from int to double, in this case)

        System.out.println(x);
        System.out.println(y);
    }
}

/*
Output:
454
454.0
 */