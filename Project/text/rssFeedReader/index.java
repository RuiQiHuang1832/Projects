package rssFeedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Given a link to RSS/Atom Feed, get all posts and display them.
 * */
public class index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a RSS URL to retrieve contents from: ");
        String inputURL = input.nextLine();
        System.out.println("Processing..");
        System.out.println( readRSS(inputURL));

    }

    public static String readRSS(String urlAddress) {
        int num = 0;

        String searchedString = "<title>";
        try {
            URL rssURL = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssURL.openStream()));
            StringBuilder sourceCode = new StringBuilder();
            String line;
            //this loop accounts for multiple tags on the same line.
            //read line reads a single line, then goes to the next line
            while ((line = in.readLine()) != null) {
                // once it resets, reset start and end indexes
                int endIndex = 0;
                int startIndex = 0;
                while (startIndex >= 0) {
                    //start from 0 and look for substring and save to start index
                    //after going through whole loop, start at the end index and look for title..
                    //if it can't be found startINdex becomes -1, does not enter for loop and exits this while loop
                    //next while loop will read into the next line and search again.
                    startIndex = line.indexOf(searchedString, endIndex);
                    //if not reset yet, check for last index and use the start index as the beginning
                    if (startIndex >= 0) {
                        endIndex = line.indexOf("</title>", startIndex);
                        //save everything into source code
                       sourceCode.append(num++).append(". ").append(line, startIndex + searchedString.length(), endIndex).append("\n");

                    }

                }
            }

            in.close();
            return sourceCode.toString();
        } catch (MalformedURLException ue) {
            System.out.println("Malformed URL");
        } catch (IOException ioe) {
            System.out.println("Something went wrong reading contents, perhaps URL");
        }
        return null;
    }

}
