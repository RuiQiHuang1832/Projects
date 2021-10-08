package FizzBuzz;

/**
 * Description: Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 */
//No Test Needed
public class index {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.print("\t\t["+ i + "]"+"\"FB\" ");
            } else if (i % 3 == 0) {
                System.out.print("\t\t["+ i + "]"+"\"F\"");
            } else if (i % 5 == 0) {
                System.out.print("\t\t["+ i + "]"+"\"B\"");
            } else {
                System.out.print("\t\t" + i);

            }
            if (i % 10 == 0) {
                System.out.println();

            }
        }
    }
}
