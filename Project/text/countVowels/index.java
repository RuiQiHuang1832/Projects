package countVowels;

import java.util.Set;

/**
 * Enter a string and the program counts the number of vowels in the text.
 * For added complexity have it report a sum of each vowel found.
 * */
public class index {
    public static void main(String[] args) {
        String input = "This has 8 vowels and 18 Consonants";
        int vowelCount = 0;
        int consonantCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String lowercaseInput = input.toLowerCase();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            boolean isVowel = false;
            for(int k = 0; k < vowels.length; k++) {
                if(lowercaseInput.charAt(i) == vowels[k]) {
                    isVowel = true;
                    vowelCount++;
                }

            }
            if(Character.isLetter(lowercaseInput.charAt(i)) && !isVowel) {
                consonantCount++;
            }
        }
        System.out.println("Using Char[] array: This string contains " + vowelCount + " vowels and " + consonantCount + " consonants");
        countVowelsAlternative();

    }

    public static void countVowelsAlternative() {
        String input = "This has 8 vowels and 18 Consonants";
        int vowelCount = 0;
        int consonantCount = 0;
        String lowercaseInput = input.toLowerCase();

        final Set<Character> vowel_set = Set.of('a', 'e', 'i', 'o', 'u', 'y');

        for (int i = 0; i < lowercaseInput.length(); i++) {

            if (vowel_set.contains(lowercaseInput.charAt(i))) {
                vowelCount++;
            } else if (Character.isLetter(lowercaseInput.charAt(i))) {
                consonantCount++;
            }



        }
        System.out.println();
        System.out.println("Using Set<char>: This string contains " + vowelCount +
                " vowels, " + consonantCount + " consonants and " + lowercaseInput.length() + " Characters."  );
    }
}
