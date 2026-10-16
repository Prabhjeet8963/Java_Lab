
 abstract class EntityBase {
    
    abstract void show();// Abstract method (no body)

    int a = 10000;
    
    // Regular concrete method
    void display() {
        System.out.println("Hello from abstract class EntityBase");
    }
}

public class eabstract extends EntityBase {

    @Override //we must override the abstract method in the subclass because it has no body in the abstract class
    void show() {
        a = a + 1; // Abstract class variables are not final by default
        System.out.println("This is prabhjeet's class abstract. Value of inherited variable 'a' is " + a);
    }
    
    public static void main(String[] args) {
        System.out.println("--- Abstract Class ---");
        
        //EntityBase e = new EntityBase(); --error
        
        eabstract obj = new eabstract(); // Creating an instance of the subclass to access the abstract method
        obj.show();
        obj.display(); // Calling inherited concrete method
    }
}
