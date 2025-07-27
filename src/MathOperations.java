public class MathOperations {
    public static void main(String[] args) {
        // add, subtract, multiply, divide
        System.out.println(add(1, 2));
        System.out.println(subtract(1, 2));
        System.out.println(multiply(5,5));
        System.out.println(divide(100, 2));

        // find max
        System.out.println(findMax(100, 500));

        // calculate difference
        System.out.println(difference(10, 20));

        // squareArea, squarePerimeter
        System.out.println("squareArea: " + squareArea(5));
        System.out.println("squarePerimeter: " + squarePerimeter(10));

        // convertSecondsToMinutes
        System.out.println("SecondsToMinutes: " + convertSecondsToMinutes(600));

        // avg speed
        System.out.println("Average Speed: " + averageSpeed(100, 10));
        System.out.println("Average Speed: " + averageSpeed(333, 33));

        // findHypotenuse
        System.out.println("Hypotenuse: " + findHypotenuse(3, 4));
        System.out.println("Hypotenuse: " + findHypotenuse(5, 12));

        // circleCircumference
        System.out.println("Circle Circumference: " + circleCircumference(5));
        System.out.println("Circle Circumference: " + circleCircumference(10));
        System.out.println("Circle Circumference: " + circleCircumference(23));

        // calculatePercentage
        System.out.println("Calculate Percentage: " + calculatePercentage(100, 50));
        System.out.println("Calculate Percentage: " + calculatePercentage(100, 100));
        System.out.println("Calculate Percentage: " + calculatePercentage(100, 0));

        // celsiusToFahrenheit
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(100));

        // fahrenheit to celsius
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(212));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        int i = side * side;
        return i;
    }

    public static int squarePerimeter(int side) {
        int i = 4 * side;
        return i;
    }

    public static double convertSecondsToMinutes(int seconds) {
        double i = seconds / 60.0;
        return i;
    }


    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Total cannot be 0");
        }
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
