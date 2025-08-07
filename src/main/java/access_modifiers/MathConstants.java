package access_modifiers;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static void calculateCircleArea(double r) {
        double area = PI * r * r;
        System.out.println("Area: " + area);
    }

    public static void calculateCircumference(double r) {
        double calc = 2 * PI * r;
        System.out.println("Circumference: " + calc);
    }

}
