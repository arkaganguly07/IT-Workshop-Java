/*
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. To declare an array, define the variable type with square brackets.
    // Code Syntax
    datatype[] variableName = {arrayElement1, arrayElement2, ...};

✔Access the Elements of an Array
You can access an array element by referring to the index number.
    // Code Sample
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]); // Outputs Volvo

✔Change an Array Element
To change the value of a specific element, refer to the index number.
    // Code Sample
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    System.out.println(cars[0]); // Now outputs Opel instead of Volvo

✔Array Length
To find out how many elements an array has, use the length property.
    // Code Sample
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars.length); // Outputs 4

✔Multidimensional Arrays
A multidimensional array is an array of arrays. Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns. To create a two-dimensional array, add each array within its own set of curly braces:
    // Code Sample
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

🎱Access Elements
To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers.
    // Code Sample
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]); // Outputs 7

🎱Loop Through a Multi-Dimensional Array
We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes).
    // Code Sample
    public class Main {
      public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
          for(int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
          }
        }
      }
    }
 */

public class JavaArrays {
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        System.out.println("Access the Elements of an Array...");
        System.out.println(cars[0]);

        System.out.println("\nChange an Array Element...");
        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println("\nArray Length...");
        System.out.println(cars.length);

        System.out.println("\nAccess Elements of Multidimensional Arrays...");
        System.out.println(myNumbers[1][2]);

        System.out.println("\nLoop Through a Multi-Dimensional Array...");
        for (int i = 0; i < myNumbers.length; ++i)
            for(int j = 0; j < myNumbers[i].length; ++j)
                System.out.println(myNumbers[i][j]);
    }
}

/*
Output:
Access the Elements of an Array...
Volvo

Change an Array Element...
Opel

Array Length...
4

Access Elements of Multidimensional Arrays...
7

Loop Through a Multi-Dimensional Array...
1
2
3
4
5
6
7
 */