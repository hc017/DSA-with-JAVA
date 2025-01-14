package SwitchCase;
import java.util.Scanner;

public class SwitchCaseCharcters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please choose a Alphabet (A/B/C): ");
        
        char switchCase = sc.nextLine().charAt(0);  // Store the user input
        //  String switchCase = sc.nextLine().toUpperCase();  // Store the user input

        
        switch (switchCase) {
            case 'A':
                System.out.println("This is A");
                break;
            // case 'A':
            //     System.out.println("This is A");
            //     break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            default:
                System.out.println("Unknown input");
                break;
        }
        

    }

}
