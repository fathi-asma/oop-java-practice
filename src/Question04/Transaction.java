package Question04;

public class Transaction {
    private String transactionID;
    private double amount;


    public Transaction(String transactionID, double amount) {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public void processDeposit(Account acc){
      acc.setBalance(acc.getBalance()+ amount);
    }

    public void processWithdrawal(Account account){
        if (amount <= account.balance){
            account.balance = account.balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayTransactionDetails() {
        System.out.println("Deposit of $300.0 successful.");
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Transaction Amount: " + amount);
        System.out.println();





















    }

}
