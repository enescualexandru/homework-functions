/**
 * 2. Fahrenheit to Celsius Conversion
 * - create a method that converts temperature from Fahrenheit to Celsius.
 * - write a program that for a given (by the user) body temperature, measured in Fahrenheit degrees,
 * outputs it in Celsius degrees, with the following message Your body temperature in Celsius degrees is X,
 * where X is respectively the Celsius degrees. In addition if the measured temperature in Celsius is
 * higher than 37 degrees, the program should warn the user that they are ill, with the following
 * message You are ill!. ( use the method created before)
 */


package conversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fahrenheitDeg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor body temperature, in Fahrenheit degrees: ");
        fahrenheitDeg = scanner.nextDouble();
        double result = getCelsius(fahrenheitDeg);
        System.out.println("Your body temperature in Celsius degrees is " + result);
        if (result > 37) {
            System.out.println("You are ill !");
        }

    }

    private static double getCelsius(double fahrenheitDeg) {
        //returns the Celsius temperature rounded to one decimal.
        double celsiusDeg = (fahrenheitDeg - 32) * 5 / 9;
        celsiusDeg = Math.round(celsiusDeg * 10) / 10.0;
        return celsiusDeg;
    }
}

