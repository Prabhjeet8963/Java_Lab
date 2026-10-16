package J;

import java.util.Queue; 
import java.util.LinkedList; 

public class j05 {
    public static void main(String args[]) {
        System.out.println("Prabhjeet");
        Queue<Integer> queue = new LinkedList<>();
        
        // 1. offer()
        queue.offer(12); 
        queue.offer(13); 
        queue.offer(14);
        System.out.println(queue); 
        System.out.println(queue.peek());
        
        // 2. poll()
        System.out.println(queue.poll());
    }
}
