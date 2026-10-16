package Prabh_assingment;

public class hQ9 {
    public static void main(String args[]) { 
        System.out.println("Prabhjeet");
        String name = "Prabhjeet";
        String rev = "";
        for(int i = name.length() - 1; i >= 0; i--) { 
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse: " + rev);
    }
}
