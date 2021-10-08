package primeFactorization;

import java.util.ArrayList;
/**
 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.
 * */
public class index {
    public static void main(String[] args) {
        int num = 100;
        //boxed object
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 2; i < num; i++) {
            while (num % i == 0 ) {
                arrayList.add(i);
                num = num / i;
            }
        }

     for (int j: arrayList) {
         System.out.print(" " +j);
     }
     if(num > 2) {
         System.out.println(num);
     }

    }
}
