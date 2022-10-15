/*
Q11> Implementation of final keyword before a class.
 */
// Commented out code should be written without commenting it out.

final class FinalClass{
    public void display()
    {
        System.out.println("This is a final class");
    }
}

/*
public class Question11 extends FinalClass{
    public void display()
    {
        System.out.println("Final class override complete");
    }

    public static void main(String[] args)
    {
        Question11 obj = new Question11();
        obj.display();
    }
}
 */

/*
If the code
"public class Question11 extends FinalClass{
    public void display()
    {
        System.out.println("Final class override complete");
    }

    public static void main(String[] args)
    {
        Question11 obj = new Question11();
        obj.display();
    }
}"
is not commented out then the output shows an error.

Output (when not commented out):
cannot inherit from final FinalClass
class Main extends FinalClass {
                   ^
 */