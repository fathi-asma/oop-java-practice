package Question04;

public class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails (){
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: "  + accountHolderName );
        System.out.println("Current Balance: " + balance);

    }
}
