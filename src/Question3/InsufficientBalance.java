package Question3;

public class InsufficientBalance extends Exception {
    public InsufficientBalance() {
        super("Withdrawal amount cannot exceed current balance");
    }
    private static final double CURRENT_BALANCE = 1000.0;




}
