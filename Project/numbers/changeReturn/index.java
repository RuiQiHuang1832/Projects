package changeReturn;

public class index {
    public static void main(String[] args) {
        double cost = 2.18;
        double moneyGiven = 3;
        double change = cost - moneyGiven;
        double absChange = Math.abs(change);
        double quarter = 0.25;
        double dime = 0.10;
        double nickle = 0.05;
        double penny = 0.01;
        int quarterIncrement = 0;
        int dimeIncrement = 0;
        int nickleIncrement = 0;
        int pennyIncrement = 0;

        double temp = absChange * 100;
        absChange = Math.round(temp);
        absChange = absChange / 100;
        System.out.println("Your change is: " + absChange);
        while (absChange > quarter ) {
            absChange =  (absChange - quarter);
            quarterIncrement++;

        }


        while (absChange > dime ) {
            absChange = absChange - dime;
            dimeIncrement++;
        }
        while (absChange > nickle ) {
            absChange =  (absChange - nickle);
            nickleIncrement++;
        }
        double temp2 = absChange * 100;
        absChange = Math.round(temp2);
        absChange = absChange / 100;

        while (absChange > 0) {
            absChange = absChange - penny;
            pennyIncrement++;
        }

        System.out.println(quarterIncrement + " Quarters, " + dimeIncrement + " Dimes, " + nickleIncrement + " Nickles, "
                + pennyIncrement + " Pennies,");

        double val = quarterIncrement * quarter + dimeIncrement * dime + nickleIncrement * nickle + pennyIncrement * penny;
        System.out.println(val);

        System.out.format("%.2f%n",val);
    }
}
