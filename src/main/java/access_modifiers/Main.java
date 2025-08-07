package access_modifiers;

public class Main {
    public static void main(String[] args) {

//        // Task 1
        Company empl1 = new Company(1, "Marko");
        Company empl2 = new Company(2, "Dragana");
        Company empl3 = new Company(3, "Nebojša");

        Company.companyName = "NCR";

        System.out.println(empl1.companyName);
        System.out.println(empl2.companyName);
        System.out.println(empl3.companyName);

//        empl1.employeeID = 33;
//
//        // Task 2
        MathConstants.calculateCircleArea(228);
        MathConstants.calculateCircumference(69);


        // Task 4

        University st1 = new University(1, "Pavel");
        University st2 = new University(2, "Pavel");
        University st3 = new University(3, "Pavel");

        University.changeUniversityName("NY University");
        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();

        // Task 5
        GameSettings chess = new GameSettings("Chess", 2);
        GameSettings padel = new GameSettings("Padel", 4);
        GameSettings.setMaxPlayers(5);
        chess.addPlayer();
        padel.addPlayer();
        chess.printGameStatus();
        padel.printGameStatus();

        // Task 6
        Person vasya = new Person("123456789", "Petrov", "Vasya");
        Person kolya = new Person("123456333", "Petrov", "Kolya");
        Person kostya = new Person("222456789", "Petrov", "Kostya");

        vasya.setLastName("Markov");

        vasya.printPersonInfo();
        kolya.printPersonInfo();
        kostya.printPersonInfo();
    }
}
