package ithread;

class SyncDemo {
    synchronized void print(){ 
        for(int i=1;i<=3;i++){ 
            System.out.println(i);
        }
    }
}

class T1 extends Thread { 
    SyncDemo s; 
    T1(SyncDemo s){this.s=s;} 
    public void run(){s.print();}
}

class T2 extends Thread { 
    SyncDemo s; 
    T2(SyncDemo s){this.s=s;} 
    public void run(){s.print();}
}

public class iQ6 {
    public static void main(String[] args){ 
        System.out.println("Name: Prabhjeet"); 
        SyncDemo s = new SyncDemo();
        new T1(s).start();
        new T2(s).start(); 
    }
}
