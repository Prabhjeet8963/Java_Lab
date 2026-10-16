package Prabh_assingment;

public class hQ11 {
    public static void main(String args[]) { 
        System.out.println("Prabhjeet");
        String name = "madam";
        String rev = "";
        for(int i = name.length()-1; i>=0; i--) { 
            rev = rev + name.charAt(i);
        } 
        if(name.equals(rev)) 
            System.out.println("Palindrome"); 
        else
            System.out.println("Not Palindrome"); 
    }
}
