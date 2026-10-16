interface SimpleInterface {

    int a = 1000; // In interface, all variables are by default, public, static, and final (constant)
    void show(); // In interface, all methods are by default, abstract (no body)
    
    static void display() {
        System.out.println("Hello from static method in SimpleInterface");
    }
}

public class einterphase implements SimpleInterface {

    @Override
    public void show() {
        System.out.println("This is class einterphase implementing SimpleInterface. Value of a: " + a);
    }
    
    void displayLocal() {
        // a = a + 1; // Cannot do this because 'a' is final (constant) in the interface
        System.out.println("Hello from local method. Value of a: " + a);
    }

    public static void main(String[] args) {
        System.out.println(" More Interface Examples by Prabhjeet Singh");
        
        SimpleInterface a1 = new einterphase();
        a1.show();
        SimpleInterface.display();
        
        einterphase obj = new einterphase();
        obj.displayLocal();
    }
}
