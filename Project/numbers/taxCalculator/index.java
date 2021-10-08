package taxCalculator;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sales Tax Calculator");
        System.out.println("Enter a cost: ");
        double cost = input.nextDouble();
        System.out.println("Enter a country or state tax: ");
        double tax = input.nextDouble() ;
        double saletax = tax/100 * cost;

        System.out.printf("Before Tax Price: $" + "%.2f%n",cost);
        System.out.format("Sale Tax" + " %.2f%% or $%.2f%n", tax, saletax);
        double afterTax = saletax + cost;
        System.out.format("After tax price: $%.2f%n",afterTax);





    }
}
