import java.util.Scanner;

public class cScanner {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = obj.nextInt();
            
            System.out.print("Enter your name: ");
            String name = obj.nextLine();
            // Consume the newline character left by nextInt()
            // This is necessary to avoid issues when reading the next line of input
            //buffer readear nextLine() to consume the newline character
            
            //package used for buffer readear is java.io.BufferedReader
            //exception is IOException
            
            System.out.println("Age: " + age);
            System.out.println("Name: " + name);
        }
    }
}
