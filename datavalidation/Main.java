/**
 * 3. Input Data Validation
 * - write a program that asks the user what time it is, by printing on the console What time is it.
 * Then the user must enter two numbers – one for hours and one for minutes.
 * If the input data represents a valid time, the program must output the message  The time is hhmm now.,
 * where hh respectively means the hours, and mm – the minutes. If the entered hours or minutes are not valid,
 * the program must print the message  Incorrect time!. The validation must be implemented in a separate method.
 * <p>
 * Additionally, I've implemented a method called formatTime(), which returns the correct time format,
 * always as hhmm.
 */


package datavalidation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte hour, minute;
        System.out.println("What time is is ?");
        System.out.println("Please enter hour:");
        hour = scanner.nextByte();
        System.out.println("Please enter minutes:");
        minute = scanner.nextByte();
        if (validateTime(hour, minute)) {
            System.out.println("The time is " + formatTime(hour, minute) + " now.");
        } else {
            System.out.println("Incorrect time !");
        }
    }

    private static boolean validateTime(byte hour, byte minute) {

        return hour < 24 && minute < 60;
    }

    private static String formatTime(byte hour, byte minute) {
        // returns correct time format, as hhmm.
        String format = "";
        format += hour < 10 ? "0" + Byte.toString(hour) : Byte.toString(hour);
        format += minute < 10 ? "0" + Byte.toString(minute) : Byte.toString(minute);
        return format;
    }
}