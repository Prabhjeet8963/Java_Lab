class MyThread1 extends Thread {

    @Override
    public void run() {

        System.out.println("Child thread 1 is running");

        System.out.println("Thread name: " + getName());
    }
}
class MyThread2 extends Thread {

    @Override
    public void run() {

        System.out.println("Child thread 2 is running");

        System.out.println("Thread name: " + getName());
    }
}

public class test2 {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        // inherited method from Thread class
        t1.setName("My First Thread");
        t2.setName("My Second Thread");

        // starts new thread
        t1.start();
        t2.start();
        
        System.out.println("Main thread executing");
    }
}