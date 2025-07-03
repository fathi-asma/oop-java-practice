package Question03;

public class InvalidGradeRange extends Exception {
    public InvalidGradeRange() {
        super("Grade must be between 0 and 100");
    }
}
