package account;

public class Current extends Account {
    public Current() {
        System.out.println("Current account created");
        display();
    }

    float minimumBalance = 500;

    public void display() {
        System.out.println(
                "Account id:" + accountId + "\nDescription:" + description + "\nMinimum Balance:" + minimumBalance);
    }
}
