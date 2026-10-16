public class gFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Prabhjeet");
            System.out.println("Step A");
            System.out.println("Step B");
            int division = 100 / 0;
            System.out.println("Step C");
            System.out.println("Step D");
            System.out.println("Step E");
        } finally {
            System.out.println("Prabhjeet says this finally block always runs!");
        }
    }
}
