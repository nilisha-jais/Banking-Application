package account;

public class Saving extends Account {
    public Saving() {
        System.out.println("Savings account created");
        display();
    }

    float minimumBalance = 0;

    public void display() {
        System.out.println(
                "Account id:" + accountId + "\nDescription:" + description + "\nMinimum Balance:" + minimumBalance);
    }
}
