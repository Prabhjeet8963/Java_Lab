// Hierarchical Inheritance
public class dp2 extends dp1 {
    void jolly() {
        System.out.println("This is class dp2");
    }
    
    public static void main(String[] args) {
        dp2 obj = new dp2();
        
        System.out.println("Hierarchical Inheritance (Child 1)");
        obj.jolly();  // Own method
        obj.show();   // Inherited method from dp1
    }
}