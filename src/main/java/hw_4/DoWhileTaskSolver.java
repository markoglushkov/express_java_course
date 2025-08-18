package hw_4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
//        positiveNumbers();
//        checkPassword();
//        oneToTenNumbers();
//        exitToTerminate();
        calculateNumbersInUserInput();
    }

    public static void positiveNumbers() {
        int number = 0;
        do {
            System.out.print("Please enter your number: ");
            number = new Scanner(System.in).nextInt();
        } while (number <= 0);
    }

    public static void checkPassword() {
        String correctPassword = "1234";
        String input;

        do {
            System.out.print("Please enter your password: ");
            input = new Scanner(System.in).nextLine();
            if (!input.equals(correctPassword)) {
                System.out.println("Password is incorrect");
            } else System.out.println("Password is correct");
        } while (!input.equals(correctPassword));
    }

    public static void oneToTenNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitToTerminate() {
        String terminate = "exit";
        String input;

        do {
            System.out.print("Please enter a password: ");
            input = new Scanner(System.in).nextLine();
        } while (!input.equals(terminate));
    }

    public static void calculateNumbersInUserInput() {
        System.out.print("Please enter a number: ");
        int value  = new Scanner(System.in).nextInt();
        int count = 0;

        // 123
        // 123 / 10 = 12
        // 12 / 10 = 1
        // 1 / 10 = 0

        do {
            value = value / 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

}
