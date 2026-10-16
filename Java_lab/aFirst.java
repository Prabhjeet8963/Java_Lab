import java.util.Scanner;

public class aFirst {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your batch: ");
            int Batch = scanner.nextInt();
            
            System.out.println("Hello, " + name + "!");
            System.out.println("You are in batch B" + Batch);
            System.out.println("");
        }
    }
} 
 
//Class is a blueprint from which individual objects are created
//public is an access modifier which allows the class to be accessible by any other class
//objects are instances of a class
//what is oops
//OOPs stands for Object Oriented Programming
//OOPs is a programming paradigm that uses "objects" to design software
//instaces are basically the objects created from a class

