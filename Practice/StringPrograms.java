/*
✔String Length:
A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the "length()" method.

✔Changing Cases (from lower case to upper case, and vice versa):
🎱"toUpperCase()" - Changes entire string to upper case.
    e.g., "Hello World" -> "HELLO WORLD"
🎱"toLowerCase()" - Changes entire string to lower case.
    e.g., "Hello World" -> "hello world"

✔Finding a Character in a String:
The "indexOf()" method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace).

✔String Concatenation:
🎱The "+" operator can be used between strings to combine them. This is called concatenation.
    // Code Sample
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);

🎱You can also use the concat() method to concatenate two strings.
    // Code Sample
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
 */

public class StringPrograms {
    public static void main(String[] args)
    {
        String firstName = "John";
        String lastName = "Doe";
        String x = "Hello World";

        System.out.println(firstName.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.indexOf('W'));
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
    }
}

/*
Output:
4
HELLO WORLD
hello world
6
John Doe
JohnDoe
 */