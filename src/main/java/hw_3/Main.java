package hw_3;

public class Main {
    public static void main(String[] args) {
//        Task 1
        Car car1 = new Car("Toyota", 2025);
        car1.setYear(2024);
        car1.print();

//        Task 2
        Rectangle rec1 = new Rectangle(15, 20);
        rec1.setWidth(1);
        int area = rec1.calculateArea();
        System.out.println("Area: " + area);

//         Task 3

        Book book1 = new Book("Harry Potter", "Unknown");
        book1.setAuthor("J. K. Rowling");
        book1.printInfo();

//         Task 4

        BankAccount marko = new BankAccount("Marko", 100);
        marko.deposit(100);
        marko.withdraw(85);
        marko.printBalance();

//         Task 5
        Point p1 = new Point(1, 0);
        p1.setX(5);
        p1.print();

//         Task 6
        StudentGroup group1 = new StudentGroup("Math");
        group1.setStudentCount(33);
        group1.printInfo();

//         Task 7

        Circle circle1 = new Circle(0);
        circle1.setRadius(5.0);

        System.out.println(Circle.calculateArea(circle1.getRadius()));
        System.out.println(Circle.calculateCircumference(circle1.getRadius()));

//         Task 8
        Teacher t1 = new Teacher("Novak Djokovic", "Košarka");
        t1.setSubject("Fizika");
        t1.printInfo();

//         Task 9
        Product milk = new Product("Milk", 100);
        milk.setPrice(50);
        milk.applyDiscount(10);
        milk.printInfo();

//         Task 10
        Laptop samsung = new Laptop("Samsung", 50000);
        samsung.setPrice(40000);
        samsung.printInfo();

    }
}
