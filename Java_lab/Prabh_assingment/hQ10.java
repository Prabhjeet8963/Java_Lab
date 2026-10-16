package Prabh_assingment;

public class hQ10 {
    public static void main(String args[]) { 
        System.out.println("Prabhjeet");
        String name = "PrabhjeetSingh";
        int count = 0;
        for(int i = 0; i < name.length(); i++) {
            char c = Character.toLowerCase(name.charAt(i)); 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
