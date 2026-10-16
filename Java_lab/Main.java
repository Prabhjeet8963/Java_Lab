

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Sum is: " + sum);

        
        int age = Integer.parseInt(args[2]);
        if(age>16){
            throw new IllegalArgumentException("Age must be less than or equal to 16");

        }
        else{
            System.out.println("Age is valid");
        }
    }
}

