class A extends Thread {
    public void run() {
        System.out.println("Thread is running!!");
    }
}

class A1 extends Thread {
    public void run() {
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
        }
    }

public class kthread     {
    public static void main(String[] args) {
        A t1 = new A();
        //t1.run(); 
        A.start();
        A1 a1 = new A1();
        A2 a2 = new A2();

        a1.run();
        a2.run();
    }
}
