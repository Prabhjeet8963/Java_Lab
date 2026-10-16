package Prabh_assingment;
import java.util.Scanner;

public class hStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Prabhjeet";

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Length of String");
            System.out.println("2. Convert Case");
            System.out.println("3. Concatenate Strings");
            System.out.println("4. Find Character");
            System.out.println("5. Substring");
            System.out.println("6. Check Start and End");
            System.out.println("7. Replace Characters");
            System.out.println("8. Remove Spaces");
            System.out.println("9. Reverse String");
            System.out.println("10. Count Vowels");
            System.out.println("11. Palindrome Check");
            System.out.println("12. Count Words");
            System.out.println("13. Duplicate Characters");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length: " + name.length());
                    break;

                case 2:
                    System.out.println("Uppercase: " + name.toUpperCase());
                    System.out.println("Lowercase: " + name.toLowerCase());
                    break;

                case 3:
                    String first = "Prabh";
                    String last = "jeet";
                    System.out.println("Using concat(): " + first.concat(last));
                    System.out.println("Using +: " + first + last);
                    break;

                case 4:
                    System.out.println("Character at index 3: " + name.charAt(3));
                    break;

                case 5:
                    System.out.println("Substring: " + name.substring(0, 5));
                    break;

                case 6:
                    System.out.println("Starts with 'Pra': " + name.startsWith("Pra"));
                    System.out.println("Ends with 'jeet': " + name.endsWith("jeet"));

                    break;

                case 7:
                    System.out.println("After replace: " + name.replace('a', '@'));
                    break;

                case 8:
                    String spaced = "   Prabhjeet   ";
                    System.out.println("After trim: '" + spaced.trim() + "'");
                    break;

                case 9:
                    String reversed = "";
                    for (int i = name.length() - 1; i >= 0; i--) {
                        reversed += name.charAt(i);
                    }
                    System.out.println("Reversed: " + reversed);
                    break;

                case 10:
                    int count = 0;
                    for (char c : name.toLowerCase().toCharArray()) {
                        if ("aeiou".indexOf(c) != -1) {
                            count++;
                        }
                    }
                    System.out.println("Vowels count: " + count);
                    break;

                case 11:
                    String rev = "";
                    for (int i = name.length() - 1; i >= 0; i--) {
                        rev += name.charAt(i);
                    }
                    if (name.equals(rev)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not Palindrome");
                    }
                    break;

                case 12:
                    String sentence = "Prabhjeet is learning Java";
                    int countt = 1;

                    for (int i = 0; i < sentence.length(); i++) {
                        if (sentence.charAt(i) == ' ') {
                            countt++;
                        }
                    }

                    System.out.println("Word count: " + countt);
                    break;

                case 13:
                    System.out.println("Duplicate characters:");
                    for (int i = 0; i < name.length(); i++) {
                        for (int j = i + 1; j < name.length(); j++) {
                            if (name.charAt(i) == name.charAt(j)) {
                                System.out.println(name.charAt(i));
                                break;
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
