public class jmutable {
    public static void main(String[] args) {
        //we are checking for mutability and immutability of string
        String s1 = "hello";
        s1 = s1 + " java!";
        System.out.println(s1);
        //In this example, we create a string s1 with the value "hello". When
        //we concatenate " java!" to it, a new string object is created in the string constant pool,
        //and s1 now references this new string. The original string "hello" remains unchanged.

        String s2= new String("Hello");
        s2.concat("Java");
        System.out.println(s2);


        //String buffer makes mutable string 
        StringBuffer s3 = new StringBuffer("Hello"); 
        s3.append(" Java");
        System.out.println(s3);

        //String builder also makes mutable string
        StringBuilder s4 = new StringBuilder("Hello");
        s4.append(" Java!!");
        System.out.println(s4);


        //Difference between string buffer and string builder
        //StringBuffer is synchronized, which means it is thread-safe and can be used in multi
        //-threaded environments. StringBuilder is not synchronized,\
        // which means it is not thread-safe and should be used in single-threaded environments for better performance.
    }
}
