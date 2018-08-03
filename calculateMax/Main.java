/**
 * 1. Calculate Max
 * - Create a method getMax() with two integer (int) parameters, that returns maximal of the two numbers.
 * - Write a program that reads three numbers from the console and prints the biggest of them.
 * Use the getMax() method you just created.
 */

package calculateMax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter first integer number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second integer number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third integer number: ");
        c = scanner.nextInt();
        System.out.println("The biggest number is: " + getMax(getMax(a, b), c));
    }

    private static int getMax(int a, int b) {
        return a < b ? b : a;
    }
}
