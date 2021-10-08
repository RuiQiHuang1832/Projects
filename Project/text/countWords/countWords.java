package countWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Counts the number of individual words in a string.
 * For added complexity read these strings in from a text file and generate a summary.
 */
public class countWords {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);


        System.out.println("Choose a .txt file on Desktop: " );
       String filename = input.nextLine();
       String theFile =  "C:\\Users\\Ben\\Desktop\\" + filename;

       // String filename = "C:\\Users\\Ben\\Desktop\\test.txt";

        String data = new String(Files.readAllBytes(Paths.get(theFile)));


        System.out.println("Choose a way to count words: " );
        System.out.print("[1] Split Words. [2] tokenizer. [3] 0 Libraries " );

        int value = input.nextInt();

        System.out.println("You chose "+ value);

        switch (value) {
            case 1:
                splitWords(data);
                break;
            case 2:
                tokinizerWordCount(data);
                break;
            case 3:
                librarylessWordCount(data);
                break;
            default:
                System.out.println("Not a value");
                break;

        }



    }

    public static void splitWords(String text) {
        //String text = "hello    world";
        // "/s" detects space
        // "/" escapes
        // "+" finds multiple spaces
        String[] words = text.split("\\s+");
        System.out.println(words.length);
    }

    public static void tokinizerWordCount(String text) {
        // String text = "hello world";
        StringTokenizer tokens = new StringTokenizer(text);
        System.out.println(tokens.countTokens());

    }

    public static void librarylessWordCount(String text) {
        //String text = "hello world";

        int wordCount = 0;
        int EOL = text.length() - 1;
        char[] chars = text.toCharArray();
        boolean isWord = false;


        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && i != EOL) {
                isWord = true;

            } else if (!Character.isLetter(chars[i]) && isWord) {
                wordCount++;
                isWord = false;
                //checks  last letter
            } else if (Character.isLetter(chars[i]) && i == EOL) {
                wordCount++;
            }
        }

        System.out.println(wordCount);
    }

}
