package mortgageCalculator;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Calculate total Monthly Mortgage payment");

            System.out.println("Enter the principal amount: ");
            int loan = input.nextInt();
            System.out.println("Enter the monthly interest rate: ");
            double interest = (input.nextDouble() / 100) / 12;
            System.out.println("Enter the fixed number of payments over the life of the loan: ");
            int loanTerm = input.nextInt() * 12;


            double monthlyPayment = loan*(interest*Math.pow(1+interest,loanTerm) / (Math.pow(1+interest,loanTerm) - 1) );



            System.out.println("Your monthly mortgage payment monthly is: $" + Math.round(monthlyPayment));







    }
}
