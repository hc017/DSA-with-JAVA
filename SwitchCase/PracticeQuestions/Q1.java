package SwitchCase.PracticeQuestions;

import java.util.Scanner;

// Question :
// Declare a Char Variable and initialise it any Letter of the English alphabet.
// Determine whether the input is a Vowel or not.
// Do this using a Switch Statement.

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz the Alphabet you wanna check its vowel or not: ");

        String switchCase = sc.nextLine().toLowerCase();

        switch (switchCase) {
            case "a":
                System.out.println("Its a Vowel");
                break;
            case "e":
                System.out.println("Its a Vowel");
                break;
            case "i":
                System.out.println("Its a Vowel");
                break;
            case "o":
                System.out.println("Its a Vowel");
                break;
            case "u":
                System.out.println("Its a Vowel");
                break;
            default:
            System.out.println("It a Consonant");
                break;
        }
    }

}
