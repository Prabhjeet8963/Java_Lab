// Multilevel Inheritance
public class dc2 extends dc1 {
    void Showcase() {
        System.out.println("This is Sub-child class dc2");
        System.out.println("Multi-level inheritance");
    }
    
    public static void main(String[] args) {
        dc2 obj = new dc2();
        
        System.out.println(" Multilevel Inheritance");
        obj.Showcase(); // Own method
        obj.display();  // Inherited from dc1
        obj.show();     // Inherited from dp1
        obj.Sing();     // Inherited from dc1
    }
}