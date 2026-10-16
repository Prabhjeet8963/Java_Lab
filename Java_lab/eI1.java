interface I1Base {
    int a = 1000;
    void show();
    
    static void display() {  
        System.out.println("Hello from static method in I1Base");
    }       
}

// Interface inheritance (Interface extending another Interface)
interface I2 extends I1Base {
    void show2();
}

public class eI1 implements I2 {

    @Override
    public void show() {
        System.out.println("This is class eI1 (Implementing show). Value of a: " + a);
    }
    
    @Override
    public void show2() {
        System.out.println("This is show2 method (Implemented from I2)");
    }

    public static void main(String[] args) {
        System.out.println("Prabhjeet's Interface Inheritance ");

        I1Base a1 = new eI1();
        a1.show();
        I1Base.display();
        
        I2 i2 = new eI1();
        i2.show2();
        i2.show(); // Calls the same implementation
    }
}