package practice_2;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(24, "Petr");
        Student konstantin = new Student(23, "Kosta");

        petya.printInfo();
        konstantin.printInfo();

    }
}
