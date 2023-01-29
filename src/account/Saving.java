package account;

import customer.Customer;

public class Saving extends Account {
    float minimumBalance = 0;
    String description = "Savings account";

    public Saving(long accountId) {
        this.accountId = accountId;
        display();
        new Customer().openAccount();
    }

    public void display() {
        System.out.println("Your account successfully created!");
        System.out.println(
                "Account id:" + accountId + "\nDescription:" + description + "\nMinimum Balance:" + minimumBalance);
    }
}
