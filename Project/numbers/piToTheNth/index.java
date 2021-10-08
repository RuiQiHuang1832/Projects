package piToTheNth;

/**
 * Enter a number and have the program generate PI up to that many decimal places.
 * Keep a limit to how far the program will go.
 * */

public class index {
    public static void main(String[] args) {
        double value =  Math.PI;

        value = value * Math.pow(10, 3);

        value = Math.floor(value);

        value = value / Math.pow(10, 3);
        System.out.println(value);



    }


}
