package practice_1;

public class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major) {
        this.age = age;
        this.major = major;
        this.name = name;
    }


    public static void main(String[] args) {
        Student vasya = new Student("Vasya", 20, "Computer Science");
        System.out.println(vasya.name);
        System.out.println(vasya.age);
        System.out.println(vasya.major);

        Student petya = new Student("Petya", 25, "Marketing");
        System.out.println(petya.name);
        System.out.println(petya.age);
        System.out.println(petya.major);
    }

}
