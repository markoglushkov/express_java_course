package practice_4.solvers;

public class IfElseTaskSolver {
    /**
     * Метод для проверки чётности числа number
     * @param number
     * @return
     */
    public String checkEvenOdd(int number) {
        // method should have one return
        String parity = "Odd";

        if (number % 2 == 0) {
            parity = "Even";
        }
        return parity;
    }

    public String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Adolescent";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Adult";
        }
        if (age > 60) {
            ageDescription = "Senior";
        }
        return ageDescription;
    }

    public int findMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }
}
