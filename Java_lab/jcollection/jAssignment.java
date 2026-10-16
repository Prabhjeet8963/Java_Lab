package jcollection;

import java.util.*;

public class jAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Prabhjeet");
        System.out.println("-------------------------");
        System.out.println("Select a question to run (1-5):");
        System.out.println("1: HashSet Demo (Q1)");
        System.out.println("2: TreeSet Demo (Q2)");
        System.out.println("3: PriorityQueue Demo (Q3)");
        System.out.println("4: HashMap Demo (Q4)");
        System.out.println("5: LinkedHashMap Demo (Q5)");
        System.out.print("Enter choice: ");
        
        int choice = 0;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        }

        System.out.println("-------------------------");

        switch (choice) {
            case 1:
                runQ1();
                break;
            case 2:
                runQ2();
                break;
            case 3:
                runQ3();
                break;
            case 4:
                runQ4();
                break;
            case 5:
                runQ5();
                break;
            default:
                System.out.println("Invalid choice. Please run the program again and select a number from 1 to 5.");
        }
        sc.close();
    }

    public static void runQ1() {
        System.out.println("--- Running Q1 (HashSet) ---");
        System.out.println("Name: Prabhjeet");
        HashSet<String> set = new HashSet<>(); 
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("C"); 
        for(String s : set) { 
            System.out.println(s);
        }
    }

    public static void runQ2() {
        System.out.println("--- Running Q2 (TreeSet) ---");
        System.out.println("Name: Prabhjeet");
        TreeSet<Integer> set = new TreeSet<>(); 
        set.add(30);
        set.add(10);
        set.add(20); 
        for(int n : set) {
            System.out.println(n);
        }
    }

    public static void runQ3() {
        System.out.println("--- Running Q3 (PriorityQueue) ---");
        System.out.println("Name: Prabhjeet");
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        q.add(30);
        q.add(10);
        q.add(20); 
        while(!q.isEmpty()) { 
            System.out.println(q.poll());
        }
    }

    public static void runQ4() {
        System.out.println("--- Running Q4 (HashMap) ---");
        System.out.println("Name: Prabhjeet");
        HashMap<Integer,String> map = new HashMap<>(); 
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        for(Map.Entry<Integer,String> e : map.entrySet()) { 
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

    public static void runQ5() {
        System.out.println("--- Running Q5 (LinkedHashMap) ---");
        System.out.println("Name: Prabhjeet");
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(); 
        map.put(3,"C");
        map.put(1,"A");
        map.put(2,"B");
        for(Map.Entry<Integer,String> e : map.entrySet()) { 
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
