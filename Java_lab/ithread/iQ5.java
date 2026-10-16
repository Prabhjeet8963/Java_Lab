package ithread;

class AliveDemo extends Thread { 
    public void run(){ 
        System.out.println("Running");
    }
}

public class iQ5 {
    public static void main(String[] args){ 
        System.out.println("Name: Prabhjeet"); 
        AliveDemo t = new AliveDemo(); 
        System.out.println(t.isAlive());
        t.start(); 
        System.out.println(t.isAlive());
    }
}
