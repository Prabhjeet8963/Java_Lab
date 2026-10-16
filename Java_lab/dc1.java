// Single Inheritance
public class dc1 extends dp1 {
    void display() {
        System.out.println("This is child class dc1");
        System.out.println("Single inheritance");
    }
    
    void Sing() {
        System.out.println("Happy birthday to me");
    }
    
    public static void main(String[] args) {
        dc1 obj = new dc1();

        System.out.println(" Single Inheritance");
        obj.display(); // Own method
        obj.show();    // Inherited from dp1
        obj.Sing();
        obj.Sing();
        obj.Sing();
    }
}
