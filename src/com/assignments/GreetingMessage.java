// Take name as input and print a greeting message for that particular name.

import java.lang.String;
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println("Enter a name:");
        String name;
        Scanner sc = new Scanner(System.in);
        // Taking full name (first name + surname)
        name = sc.nextLine(); 
        sc.close();
        System.out.println("Hello " + name + "! " + "What's going on..?");
    }
}