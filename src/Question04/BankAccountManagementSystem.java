package Question04;

public class BankAccountManagementSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("AC1001", "Emma Brown", 1000.0, 4.5);


        Transaction deposit = new Transaction("TXN-D001", 300.0);
        Transaction withdrawal = new Transaction("TXN-W001", 500.0);


        deposit.displayTransactionDetails();
        deposit. processDeposit(savings);

        // Step 4: Process Withdrawal
        withdrawal.displayTransactionDetails();
        withdrawal.processWithdrawal(savings);

        savings.displayAccountDetails();
    }

}
