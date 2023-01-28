package account;

public class Account {
    long accountId;
    String description;
    float minimumBalance;

    public void display() {
        System.out.println(
                "Account id:" + accountId + "\nDescription:" + description + "\nMinimum Balance:" + minimumBalance);
    }
}
