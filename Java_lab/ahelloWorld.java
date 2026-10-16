public class ahelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello prabhjeet , this is World!");
    }
}

//how this file is compiled 
//javac helloWorld.java
//here java c is a compiler that compiles the java file into bytecode


//internal working of java file
//1. javac helloWorld.java (This command compiles the java file into bytecode and generates a file named helloWorld.class)
// (.jar file can also be generated using this command)
// Wora (Write Once Run Anywhere) concept of Java

//jitter compiler (Just In Time Compiler) is used to improve the performance of Java applications by compiling bytecode into native machine code at runtime
//2. java helloWorld (This command runs the bytecode on Java Virtual Machine (JVM) which interprets the bytecode and executes it on the host machine)
// JVM is platform dependent provided by JRE (Java Runtime Environment)

