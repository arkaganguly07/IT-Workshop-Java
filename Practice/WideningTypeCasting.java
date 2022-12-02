/*
Widening Casting: Widening casting is done automatically when passing a smaller size type to a larger size type.
 */

public class WideningTypeCasting {
    public static void main(String[] args)
    {
        int x = 454;
        double y = x; // Automatic Casting (from int to double, in this case)

        System.out.println(x);
        System.out.println(y);
    }
}

/*
Output:
454
454.0
 */