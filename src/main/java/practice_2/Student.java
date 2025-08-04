package practice_2;

import org.w3c.dom.ls.LSOutput;

public class Student {
    // поля
    int age;
    String name;

    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void printInfo() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age);
    }
}
