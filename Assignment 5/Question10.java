/*
Q10> Implementation of final keyword before a method.
 */
// Commented out code should be written without commenting it out.

class FinalDemo{
    public final void display()
    {
        System.out.println("This is a final method");
    }
}

public class Question10 extends FinalDemo{
    /*
    public final void display()
    {
        System.out.println("The final method override complete");
    }
     */

    public static void main(String[] args)
    {
        Question10 obj = new Question10();
        obj.display();
    }
}

/*
If the code
"public final void display()
    {
        System.out.println("The final method override complete");
    }"
is not commented out then the output shows an error.

Output (when not commented out):
display() in Main cannot override display() in FinalDemo
  public final void display() {
                    ^
  overridden method is final
 */