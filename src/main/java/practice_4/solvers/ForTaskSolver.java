package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
//        printMultiplicationTable(6);

//        System.out.println(sumOfAllNumbers(10));

//        System.out.println(checkIfNumberIsPrime(7));
//        System.out.println(checkIfNumberIsPrime(6));
        printAllPrimeNumbersUpTo100();
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number*i
            );
        }
    }

    public static int sumOfAllNumbers(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean checkIfNumberIsPrime(int number) {
        // простое число делится только на себя и на 1
        // 7 = 7, 1
        // проверяем, что есть хотя бы одно число, которое даст остаток 0

        // пример: 7
        // 2, 3, 4, 5, 6 -> простое

        // пример: 6
        // 2 -> не простое

        boolean isSimple = true;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllPrimeNumbersUpTo100() {
        for (int i = 2; i <= 100; i++) {
            if (checkIfNumberIsPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
