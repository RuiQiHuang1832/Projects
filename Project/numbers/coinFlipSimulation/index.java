package coinFlipSimulation;

import java.util.Random;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Times to flip coin: ");
        int flips = input.nextInt();
        int tails=0, heads=0;

        for (int i = 0; i < flips; i++) {
            if (Math.random() > 0.50) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                tails++;
            }
        }

        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);
        //Random randomNum = new Random();
        //int chance = randomNum.nextInt(2);


    }
}
