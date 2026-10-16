public class h06 {
    public static void main(String args[]) { 
        System.out.println("Prabhjeet");
        
        int a = 10;
        Integer obj1 = new Integer(a); 
        System.out.println("Boxing using new: " + obj1); 
        
        Integer obj2 = Integer.valueOf(a); 
        System.out.println("Boxing using valueOf: " + obj2); 
        
        Integer obj3 = a;
        System.out.println("Autoboxing: " + obj3); 
        
        int b = obj3; 
        System.out.println("Unboxing: " + b);
    }
}
