class i01_A extends Thread {
    public void run() {
        System.out.println("thread is running");
    }
}

class i01_B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class i01 {
    public static void main(String[] args) {
        System.out.println("Prabhjeet");

        i01_A obj1 = new i01_A();
        obj1.start();
        obj1.run();

        i01_B obj2 = new i01_B();
        i01_B obj3 = new i01_B();
        obj3.start();
        obj2.start();
    }
}
