package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {

    public static void main(String[] args) {
//        guessNumber(10);
        findMinNumber();
    }

    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);
        int userInput;

        do {
            System.out.print("Enter number: ");
            userInput = scanner.nextInt();
        } while (userInput != random);

        System.out.println("You did it!");
    }

    public static void findMinNumber() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int userNumber;

        do {
            System.out.print("Enter a userNumber: ");
            userNumber = scanner.nextInt();
            if (userNumber >= 0 && userNumber < max) max = userNumber;
        } while (userNumber >= 0);
        System.out.println("Min. number: " + max);
    }

}
