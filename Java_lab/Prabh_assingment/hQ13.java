package Prabh_assingment;

public class hQ13 {
    public static void main(String args[]) { 
        System.out.println("Prabhjeet");
        String name = "PrabhjeetSingh";
        for(int i = 0; i < name.length(); i++) { 
            int count = 1 ;
            for(int j = i + 1; j < name.length(); j++) { 
                if(name.charAt(i) == name.charAt(j)) { 
                    count++;
                }
            }
            if(count > 1) {
                System.out.println(name.charAt(i) + " appears " + count + " times");
            }
        }
    }
}
