package access_modifiers;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String ssn, String lastName, String firstName) {
        this.ssn = ssn;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        String info = "Name: " + firstName + ", Surname: " + lastName + ", SSN: " + String.format("%s-%s-%s",
                ssn.substring(0, 3),
                ssn.substring(3, 5),
                ssn.substring(5, 9));
        System.out.println(info);
    }
}
