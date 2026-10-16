import java.io.*;

public class gThrowThrows {
    void verifyAge(int personAge) {
        if (personAge < 18) {
            throw new ArithmeticException("You are not eligible to vote."); 
        } else {
            System.out.println("Prabhjeet thinks he is eligible to vote.");
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Prabhjeet");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Please enter your age:");
        
        int inputAge = Integer.parseInt(reader.readLine()); 
        
        gThrowThrows checker = new gThrowThrows(); 
        checker.verifyAge(inputAge);
    }
}
