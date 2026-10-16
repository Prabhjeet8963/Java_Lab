package ithread;

class JoinDemo extends Thread { 
    public void run(){
        for(int i=1;i<=3;i++){ 
            System.out.println("Child " + i);
        }
    }
}

public class iQ3 {
    public static void main(String[] args) throws Exception { 
        System.out.println("Name: Prabhjeet");
        JoinDemo t = new JoinDemo(); 
        t.start();
        t.join();
        for(int i=1;i<=3;i++){ 
            System.out.println("Main " + i);
        }
    }
}
