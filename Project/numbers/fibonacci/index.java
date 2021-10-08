package fibonacci;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Nth value: ");
        int inputValue = input.nextInt() ;

       for (int i = 0; i <= inputValue; i++) {
           System.out.print(fibbonaciRecursive(i) + ", ");
       }

    }

    public static int fibbonaciRecursive(int num) {
        if (num <= 1)
            return num;
        return fibbonaciRecursive(num - 1) + fibbonaciRecursive(num - 2);


    }


}
