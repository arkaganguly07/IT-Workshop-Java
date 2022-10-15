/*
Q2> Write a Java program to access the methods from package and subpackage.
 */


import pack.*;
import pack.package2.B;

public class Question2{
	public static void main(String[] args)
	{
		A obj1 = new A();
		obj1.msg();

		B obj2 = new B();
		obj2.display();
	}
}

/*
Output:
Hello Folks
Full-Metal Alchemist
 */