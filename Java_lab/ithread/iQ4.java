package ithread;

class PriorityDemo extends Thread { 
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class iQ4 {
    public static void main(String[] args){ 
        System.out.println("Name: Prabhjeet"); 
        PriorityDemo t1 = new PriorityDemo(); 
        PriorityDemo t2 = new PriorityDemo(); 
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY); 
        
        t1.start();
        t2.start();
    }
}
