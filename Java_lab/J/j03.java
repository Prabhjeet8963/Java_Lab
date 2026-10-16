package J;

import java.util.ArrayList; 

public class j03 {
    public static void main(String args[]) {
        System.out.println("Prabhjeet");
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(3); 
        System.out.println(list);
        
        // 1. add(index, value)
        list.add(1, 4); 
        System.out.println(list);
        
        // 2. addAll()
        ArrayList<Integer> newList = new ArrayList<>(); 
        newList.add(5);
        newList.add(6);
        list.addAll(newList); 
        System.out.println(list);
        
        // 3. get(index)
        System.out.println(list.get(1));
        
        // 4. set(index, value)
        System.out.println("List before updating the value indexed at 2: "+list); 
        list.set(2,8);
        System.out.println(list);
        
        // 5. remove(index)
        System.out.println("List before deletion of an element:"+list); 
        list.remove(3);
        System.out.println("List after deletion of an element indexed at 3:"+list);
        
        // 6. clear()
        list.clear();
        System.out.println(list);
    }
}
