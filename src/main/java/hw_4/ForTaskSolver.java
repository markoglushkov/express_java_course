package hw_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
//        from1To100();
//        calculateSum();
//        printMultiplicationTable();
//        checkIfNumberIsPrime();
        numberFrom1To10();
    }

    public static void from1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void calculateSum() {
        System.out.print("Please enter your number: ");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    public static void printMultiplicationTable() {

        System.out.print("Please enter your number: ");
        int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number*i
            );
        }
    }

    public static void checkIfNumberIsPrime() {
        // простое число делится только на себя и на 1
        // 7 = 7, 1
        // проверяем, что есть хотя бы одно число, которое даст остаток 0

        // пример: 7
        // 2, 3, 4, 5, 6 -> простое

        // пример: 6
        // 2 -> не простое

        System.out.print("Please enter your number: ");
        int number = new Scanner(System.in).nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }

    public static void numberFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
