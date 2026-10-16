package J;

import java.util.Stack; 

public class j04 {
    public static void main(String args[]) {
        System.out.println("Prabhjeet");
        Stack<Integer> s1 = new Stack<>();
        
        // 1. push()
        s1.push(1);
        s1.push(2);
        s1.push(3); 
        System.out.println(s1);
        
        // 2. peek()
        System.out.println(s1.peek());
        
        // 3. pop()
        s1.pop(); 
        System.out.println(s1.peek());
    }
}
