package SwitchCase;

import java.util.Scanner;


public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please choose a number (1/2/3): ");
        
        int switchCase = sc.nextInt();  // Store the user input
        
        switch (switchCase) {
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is two");
                break;
            case 3:
                System.out.println("This is three");
                break;
            default:
                System.out.println("Unknown input");
                break;
        }
        
        sc.close();  // Close the scanner
    }
}
