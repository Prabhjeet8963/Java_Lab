class i02_A implements Runnable {
    public void run() {
        System.out.println("thread is running");
    }
}

class i02_B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class i02 {
    public static void main(String[] args) {
        System.out.println("Prabhjeet");

        i02_A obj1 = new i02_A();
        Thread t1 = new Thread(obj1);
        t1.start();
        obj1.run();

        i02_B obj2 = new i02_B();
        i02_B obj3 = new i02_B();

        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t2.start();
        t3.start();
    }
}
