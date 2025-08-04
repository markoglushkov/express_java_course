package access_modifiers;

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        System.out.println("Count: " + Counter.count); // Count: 2
    }
}
