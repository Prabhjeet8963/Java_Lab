public class gCatch {
    public static void main(String[] args) {
        System.out.println("Prabhjeet");
        System.out.println("Step A");

        try {
            int division = 100 / 0;
        } catch (Exception e) {
            System.out.print("Caught an error: ");
            System.out.println(e);
        }

        System.out.println("Step B");
        System.out.println("Step C");
    }
}
