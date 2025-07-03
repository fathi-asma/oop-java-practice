package Question5PartB;

import java.util.ArrayList;

public interface  Accountable {
    int getAccountID();
    String getCustomerName();
    void displayAccountDetails();
}

class CustomerAccount implements Accountable {
    private int accountID;
    private String name;
    private double balance;
    static int idCounter = 1000;
    static int totalAccount = 3;

    public CustomerAccount( String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountID = ++idCounter;
    }


    @Override
    public int getAccountID() {
        return accountID;
    }

    @Override
    public String getCustomerName() {
        return name;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Customer Name: " + name);
        System.out.println( "Balance: " + "$ "+balance);
        System.out.println("------------------------");

    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccount);
        return totalAccount++;
    }
}

class AccountManager {
    ArrayList <CustomerAccount> accounts = new ArrayList<>();

    public void addAccount(CustomerAccount acc) {
        accounts.add(acc);
    }
    public void displayAllAccounts() {
        for (CustomerAccount accont : accounts){
            accont.displayAccountDetails();
        }
    }
}

class Main{
    public static void main(String[] args) {

        CustomerAccount c1 = new CustomerAccount("Alice Johanson",15000.75);
        CustomerAccount c2 = new CustomerAccount("Bob Smith",2350.0);
        CustomerAccount c3 = new CustomerAccount("Charlie Brown",980.5);

        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(c1);
        accountManager.addAccount(c2);
        accountManager.addAccount(c3);

        c1.displayAccountDetails();
        c2.displayAccountDetails();
        c3.displayAccountDetails();

        CustomerAccount.getTotalAccounts();




    }
}



