public class h01 {
    public static void main(String[] args) { 
        System.out.println("Prabhjeet");
        String S1 ="Hello";
        String S2 = "Hello";
        String S3 = new String("Hello1"); 
        String S4 = new String("Hello1");
        
        System.out.println(S1==S2); //checks whether two references point to the same object in memory
        System.out.println(S1.equals(S2)); 
        System.out.println(S3==S4); 
        System.out.println(S3.equals(S4));
    }
}
