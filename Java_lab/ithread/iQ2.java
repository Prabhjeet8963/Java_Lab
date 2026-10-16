package ithread;

class NameDemo extends Thread { 
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class iQ2 {
    public static void main(String[] args){ 
        System.out.println("Name: Prabhjeet"); 
        NameDemo t = new NameDemo(); 
        t.setName("Thread-1");
        t.start();
    }
}
