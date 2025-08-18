package hw_4;

import java.util.Scanner;
import java.util.StringJoiner;

public class WhileTaskSolver {
    public static void main(String[] args) {
//        calculateFactorial();
//        showOnlyEvenNumbers();
        countdownGoesDown();
    }

//    Напишите программу, которая принимает с консоли число и выводит его факториал (произведение всех чисел от 1 до n), используя цикл while.
//    Методы и конструкции:
//    Scanner
//    while
//    переменные int result = 1, int i = 1
//    System.out.println()

    public static void calculateFactorial() {

        int result = 1;
        int i = 1;

        System.out.print("Please enter the last number: ");
        int number = new Scanner(System.in).nextInt();

        while (i <= number) {
            result = result * i;
            i++;
        }

        System.out.println(result);
    }

//    2. Вывод всех чётных чисел до заданного
//
//    Задача:
//    Реализуйте программу, которая выводит все чётные числа от 1 до числа, введённого пользователем.
//    Методы и конструкции:
//    Scanner
//    while
//    if, оператор %
//    System.out.println()

    public static void showOnlyEvenNumbers() {
        System.out.print("Please enter the last number: ");
        int number = new Scanner(System.in).nextInt();

        int i = 1;

        StringJoiner joiner = new StringJoiner(", ");

        while (i <= number) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
            i++;
        }
        System.out.println(joiner);
    }

//    3. Обратный отсчёт от введённого числа до 1
//
//    Задача:
//    Создайте программу, которая принимает с консоли положительное число и выводит обратный отсчёт от него до 1.
//    Методы и конструкции:
//    Scanner
//     while
//        System.out.println()
//    декремент number--

    public static void countdownGoesDown() {
        System.out.print("Please enter the last number: ");
        int number = new Scanner(System.in).nextInt();

        int i = 1;

        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }
}
