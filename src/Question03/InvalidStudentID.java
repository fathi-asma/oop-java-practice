package Question03;

public class InvalidStudentID extends Exception {
    public InvalidStudentID() {
        super("Student ID must start with 'S' and max length is 6.");
    }
}
