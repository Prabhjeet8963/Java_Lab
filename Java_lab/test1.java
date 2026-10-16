public class test1{
    public static void main(String[] args) {
        try {
            
                int result = 10 / 0;
            }
        catch (Exception e) {
            System.out.println("Outer handled");
        }
    }
}