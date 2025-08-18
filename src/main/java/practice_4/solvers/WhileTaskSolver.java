package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void printAllNumbersUpTo10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
//        printAllNumbersUpTo10();

//        commandReader();

        // method sum check
        System.out.println(sumOfDigits(123));
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")) {
           command = scanner.nextLine();
        }
        System.out.println("Program is finished!");
    }

    public static int sumOfDigits(int number) {
        // number = 123, 1 + 2 + 3
        // остаток от деления на 10: 123 % 10 = 3
        // 123/10=12
        // остаток от деления на 10: 12 % 10 = 2
        // 12 / 10 = 1
        // остаток от деления на 10: 1 % 10 = 1
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
         return sum;
    }
}
