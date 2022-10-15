/*
Q4> Write a Java program to implement the inheritance in interface.
 */

interface Backend{
    public void connectServer();
}

class Frontend{
    public void responsive(String str)
    {
        System.out.println(str + " can also be used as frontend");
    }
}

public class Question4 extends Frontend implements Backend{
    String language = "Java";

    public void connectServer()
    {
        System.out.println(language + " can be used as backend language");
    }

    public static void main(String[] args)
    {
        Question4 java = new Question4();
        java.connectServer();
        java.responsive(java.language);
    }
}

/*
Output:
Java can be used as backend language
Java can also be used as frontend
 */