package access_modifiers;

public class University {
    static String universityName;
    final int studentID;
    String studentName;


    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + studentName + "\nID: " + studentID + "\nUniversity Name: " + universityName);
    }

}
