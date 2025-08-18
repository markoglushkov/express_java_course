package hw_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
//        sumOfNumbers();
//        divisableByThree();
//        showOnlyPositiveNumbers();
        untilStop();
    }

    public static void sumOfNumbers() {
        // 1
        // = 1
        // 2
        // = 3
        // 3
        // = 6

        int value;
        int result = 0;

        while (true) {
            System.out.print("Please enter a number: ");
            value = new Scanner(System.in).nextInt();
            if (value < 0) break;
            result = result + value;

            System.out.println("Result: " + result);
        }
    }

    public static void divisableByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }

    public static void showOnlyPositiveNumbers() {

        while (true) {
            System.out.print("Please enter a number: ");
            int userInput = new Scanner(System.in).nextInt();

            if (userInput > 0) {
                System.out.println(userInput);
            } else if (userInput == 0) {
                System.out.println("You have entered a zero!");
            } else if (userInput < 0) {
                System.out.println("You have entered a negative number!");
                break;
            }
        }
    }

    public static void untilStop() {

        while (true) {

            System.out.print("Please enter a command (use 'stop' to stop): ");
            String userInput = new Scanner(System.in).nextLine();

            if (userInput.equals("stop")) {
                break;
            }
        }
    }
}
