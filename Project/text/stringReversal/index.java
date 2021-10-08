package stringReversal;

import java.util.*;
/**
 * Description: Enter a string and the program will reverse it and print it out.
 */

public class index {

    public String stringToArrayListReversal(String input) {
        ArrayList<Character> listOfChars = new ArrayList<>();
        String userInput = input;
        char[] inputString = userInput.toCharArray();
        for (char character : inputString) {
            listOfChars.add(character);
        }
        Collections.reverse(listOfChars);
        StringBuilder sb = new StringBuilder();
        for (Character ch : listOfChars) {
            sb.append(ch);
        }

        return sb.toString();

    }


//    public void stringToArrayListReversal() {
//        Scanner input = new Scanner(System.in);
//        List<Character> listOfChars = new ArrayList<>();
//
//        System.out.println("Enter a string to reverse: ");
//        String userInput = input.nextLine();
//        char[] inputString = userInput.toCharArray();
//
//        for (char character : inputString) {
//            listOfChars.add(character);
//        }
//        Collections.reverse(listOfChars);
//        System.out.print("In reverse: ");
//
//        for (Character listOfChar : listOfChars) {
//            System.out.print(listOfChar);
//        }
//
//
//    }

//    public void stringToStringBuilderReversal() {
//        Scanner input = new Scanner(System.in);
//        StringBuilder stringInput = new StringBuilder();
//
//        System.out.println("Enter a string to reverse: ");
//        String userInput = input.nextLine();
//        stringInput.append(userInput);
//        System.out.println("Your input was: " + userInput);
//        stringInput.reverse();
//        System.out.println("In reverse: " + stringInput);
//
//    }

    public String stringToStringBuilderReversal(String input) {
        StringBuilder stringInput = new StringBuilder();
        stringInput.append(input);
        stringInput.reverse();

        return stringInput.toString();


    }

//    public void stringToArrayReversal() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string to reverse: ");
//        String userInput = input.nextLine();
//        System.out.println("Your input was: " + userInput);
//
//        char[] charToArray = userInput.toCharArray();
//        for (int i = charToArray.length - 1; i >= 0; i--) {
//            System.out.print(charToArray[i]);
//        }
//
//
//    }

    // without StringBuilder
    public String stringToArrayReversal(String input) {
        char[] charToArray = input.toCharArray();
        String reversed = "";
        for (int i = charToArray.length - 1; i >= 0; i--) {
            reversed = reversed + charToArray[i];
        }

        return reversed;
    }


}
