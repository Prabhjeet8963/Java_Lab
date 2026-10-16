import java.io.StringReader;

public class h02 {
    public static void main(String[] args) {
        System.out.println("Prabhjeet");

        String S1 = "Hello Prabhjeet"; // immutable string
        S1.concat("java");
        System.out.println(S1);

        String S2 = new String("Hello1 Prabhjeet"); // immutable
        S2.concat("java");
        System.out.println(S2);
    }
}
