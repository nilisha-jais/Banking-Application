package account;

import customer.Customer;

public class Current extends Account {

    float minimumBalance = 500;
    String description = "Current account";

    public Current(long accountId) {
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
