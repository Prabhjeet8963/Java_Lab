class Variable {

    static void staticMethod() { 
        System.out.println("This is prabhjeet's static method");
    }

    void nonStaticMethod() {
        System.out.println("This is prabhu's non-static method");
    }
}

public class cStatic {
    public static void main(String[] args) {

        Variable obj = new Variable();
        obj.nonStaticMethod();
        Variable.staticMethod();
    }
}
