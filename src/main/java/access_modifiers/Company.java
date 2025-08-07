package access_modifiers;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    /*
    Реализуйте конструктор, принимающий employeeID и employeeName,
    статический метод printCompanyName(), геттеры и сеттеры для employeeName.
    В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
    Попробуйте изменить employeeID — должно быть невозможно.
     */

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company name: " + companyName);
    }

}
