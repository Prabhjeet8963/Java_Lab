import java.util.Scanner;
//Here Java is a package
//util is a subpackage of Java
//Scanner is a class of util package
//this is a built in package

public class fpackage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))

        // why do we make a object?
        // we make a object to access the properties and methods of a class
        {
            System.out.print("Prabhjeet Enter the first value: ");
            int a = sc.nextInt();

            System.out.print("Prabhjeet, Enter the second value: ");
            int b = sc.nextInt();

            int sum = a + b;

            System.out.println("Sum Of the 2 number= " + sum);
        } finally {
            System.out.println("This block always runs.");
        }
    }
}