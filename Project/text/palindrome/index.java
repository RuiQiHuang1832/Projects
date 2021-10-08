package palindrome;

import java.util.Scanner;

/**
 * Checks if the string entered by the user is a palindrome.
 * That is that it reads the same forwards as backwards like “racecar”
 * */

public class index {
    public static void main (String[] args) {
        String input = "Racecar     ";
        String inputLowerCase = input.replaceAll("\\s+", "").toLowerCase();
        int i = 0;
        int k = inputLowerCase.length() - 1;
       // String inputLowerCase = input.toLowerCase();
        boolean palidrome = false;

        while (i < k) {
            if (inputLowerCase.charAt(i) == inputLowerCase.charAt(k)) {
                //ptr
                i++;
                k--;
                palidrome = true;

            } else {
                palidrome = false;

                break;
            }
        }

        if (palidrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");

        }
        Scanner inputter = new Scanner(System.in);
        String userInput = "";
        while(true) {

            System.out.println("Check if palidrome(!exit): ");

            userInput = inputter.nextLine();
            if( userInput.equals("!exit"))
                break;

            if (isPalidromeStringBuilder(userInput)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");

            }
        }
    }

    public static boolean isPalidromeStringBuilder(String input) {
        // removing spaces
        String inputCleaned = input.replaceAll("\\s+", "").toLowerCase();

        StringBuilder sb = new StringBuilder(inputCleaned);


        return sb.reverse().toString().equals(inputCleaned);


    }

}
