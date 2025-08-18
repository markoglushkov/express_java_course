package hw_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
//        determineNumberSign();
//        findMaxNumber();
//        showGradeDescription();
//        isEven();
//        discountCalculator();
        evaluateTestsResults();
    }


//    1. Определение знака числа
//
//    Задача:
//    Напишите программу, которая принимает с консоли число и проверяет:
//    Если число больше 0, выведите "Число положительное".
//    Если меньше 0 — "Число отрицательное".
//    Если равно 0 — "Число равно нулю".
//    Методы и конструкции:
//    Scanner
//    if, else if, else
//    System.out.println()

    public static void determineNumberSign() {
        //  Scanner scanner = new Scanner(System.in);
        // do I have to create Scanner scanner object here or int userInput = new Scanner(System.in).nextInt();
        // will be enough?
        while (true) {
            System.out.print("Enter a number: ");
            int userInput = new Scanner(System.in).nextInt();
            if (userInput > 0) System.out.println("The number is positive");
            else if (userInput == 0) System.out.println("The number is 0");
            else System.out.println("The number is negative!");
        }
    }

//    2. Поиск наибольшего из двух чисел
//
//    Задача:
//    Создайте программу, которая принимает два числа и выводит наибольшее из них.
//    Методы и конструкции:
//    Scanner
//if-else или Math.max()
//System.out.println()

    public static void findMaxNumber() {
        System.out.print("Enter a first number: ");
        int userInput1 = new Scanner(System.in).nextInt();
        System.out.print("Enter a second number: ");
        int userInput2 = new Scanner(System.in).nextInt();

        System.out.println("Max number: " + Math.max(userInput1, userInput2));
    }


    public static void showGradeDescription() {
        System.out.print("Enter a grade (1-5): ");
        int userInput = new Scanner(System.in).nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Unsatisfactory");
                break;
            case 2:
                System.out.println("Unsatisfactory");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }

    public static void isEven() {
        System.out.print("Please enter a number: ");
        int number = new Scanner(System.in).nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }

    public static void discountCalculator() {
        System.out.print("Please enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 18) {
            System.out.println("Discount: 25%");
        } else if (age >= 65) {
            System.out.println("Discount: 30%");
        } else {
            System.out.println("You don't have a discount");
        }
    }

    public static void evaluateTestsResults() {
        System.out.print("Please enter your score: ");
        int score = new Scanner(System.in).nextInt();

//        if (score < 60) System.out.println("Unsatisfactory");
//        if (score >= 60 && score <= 74) System.out.println();

        if (score < 0 || score > 100) System.out.println("Enter a correct number!");
        else if (score >= 90) System.out.println("Excellent!");
        else if (score >= 75) System.out.println("Good");
        else if (score >= 60) System.out.println("Satisfactory");
        else if (score < 60) System.out.println("Unsatisfactory");


    }

}