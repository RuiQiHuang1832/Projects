package creditCardValidator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> cardNum = new ArrayList<>();
        System.out.println("Enter credit card information: ");
        long i = input.nextLong();
        while ( i > 0) {
            cardNum.add((int) (i % 10));
            i /= 10;
        }

        Collections.reverse(cardNum);
        int checkDigit = cardNum.get(15);
        cardNum.remove(15);
        int size = cardNum.size();

        for (int k = 0; k <= size ; k+=2 ) {
            if (k < size )
                cardNum.set(k, cardNum.get(k) * 2);

        }
        Object[] array = cardNum.toArray();

        cardNum.clear();
        for ( int j = array.length - 1; j >= 0; j--) {
            int temp = (int) array[j];
            while (temp > 0 ) {
                cardNum.add(0, temp % 10);
                temp = temp / 10;
            }
        }

        int sum = 0;
        for (Integer o: cardNum ) {
            sum += o;
        }
        int checkSum = checkDigit + sum;

        if (checkSum % 10 == 0) {
            System.out.println("Valid Credit Card");
        } else {
            System.out.println("Invalid Credit Card Information. Try Again");
        }





    }
}
