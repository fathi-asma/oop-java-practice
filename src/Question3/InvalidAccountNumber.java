package Question3;

public class InvalidAccountNumber extends Exception {
    public InvalidAccountNumber() {
        super("Account number must be exactly 12 digits long");
    }
}
