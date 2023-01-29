package account;

abstract class Account  {
    long accountId;
    String description;
    float minimumBalance;

    public abstract void display();
}
