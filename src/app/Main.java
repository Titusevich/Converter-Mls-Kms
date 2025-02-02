package app;

import java.util.Scanner;

public class Main {

    private static final double CONVERT_KM = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of distance in miles: ");
        double mls = scan.nextDouble();
        double kilometres = convertMilesToKilometres(mls);
        System.out.printf("%nResult is %.2f kilometres.", kilometres);
    }

    private static double convertMilesToKilometres(double mls) {
        return mls * CONVERT_KM;
    }
}
