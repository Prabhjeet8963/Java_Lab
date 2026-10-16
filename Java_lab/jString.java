public class jString {

    public static void main(String args[]){ 

        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2); 
        System.out.println(s1.equals(s2)); 
        //String literals are stored in a string constant pool, so s1 and s2 refer to the same memory location,
        //hence s1 == s2 is true. The equals() method checks for content equality, which is also true in this case.

        String s3= new String("hello");
        String s4= new String("hello"); 
        System.out.println(s3==s4); 
        System.out.println(s3.equals(s4));
        //s3 and s4 are created using the new keyword, so they refer to different memory locations,
        //hence s3 == s4 is false. However, the equals() method checks for content equality, which is true since both s3 and s4 contain the same string "hello".

    }
}