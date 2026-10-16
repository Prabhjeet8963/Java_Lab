// Hierarchical Inheritance
public class dc3 extends dp1 {
    void greet() {
        System.out.println("This is class dc3");
        System.out.println("Another child inheriting from the same parent as dp2");
    }

    public static void main(String[] args) {
        dc3 obj = new dc3();
        
        System.out.println(" Hierarchical Inheritance (Child 2)");
        obj.greet();  // Own method
        obj.show();   // Inherited method from dp1
    }
}
