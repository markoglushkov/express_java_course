package hw_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
//        showDayOfWeek();
//        calculateTicketPrice();
//        evaluateTestsResults();
//        textCommandsProcessing();
        calculator();
    }

    public static void showDayOfWeek() {
        System.out.print("Please enter a number (1-7): ");
        int day = new Scanner(System.in).nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a correct value!");
                break;
        }
    }

    public static void calculateTicketPrice() {
        System.out.print("Day of the week (1-7): ");
        int day = new Scanner(System.in).nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Ticket price: 300 rubles");
                break;
            case 6:
            case 7:
                System.out.println("Ticket price: 450 rubles");
                break;
            default:
                System.out.println("Please enter a valid day number (1-7)");
                break;
        }
    }

    public static void evaluateTestsResults() {
        System.out.print("Please enter your score: ");
        int score = new Scanner(System.in).nextInt();

        if (score < 0 || score > 100) System.out.println("Enter a correct number!");
        else if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
    }

    public static void textCommandsProcessing() {
        System.out.print("Please enter a command: ");
        String input = new Scanner(System.in).nextLine().toLowerCase();

        switch (input) {
            case "start":
                System.out.println("The program is started");
                break;
            case "stop":
                System.out.println("The program is stopped");
                break;
            case "restart":
                System.out.println("The program is restarted");
                break;
            case "status":
                System.out.println("The program is running");
                break;
            default:
                System.out.println("""
                        Please enter a correct value -
                        start, stop, restart, status
                        """);
        }
    }
    //        Задача:
//        Программа принимает два числа и оператор (+, -, *, /), затем выполняет операцию и выводит результат.
//        Методы и конструкции:
//        Scanner
//        switch-case
//        if для проверки деления на 0
//        System.out.println()
//        Арифметические операторы +, -, *, /

    public static void calculator() {
        System.out.print("Please enter a first integer value: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Please enter a second integer value: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Please enter an operator (+, -, *, /): ");
        String operator = new Scanner(System.in).nextLine();

        switch (operator) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (a == 0 || b == 0) {
                    System.out.println("You cannot divide by 0");
                    break;
                }
                System.out.println(a/b);
                break;
        }
    }
}
