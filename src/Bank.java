import java.util.*;

import account.*;
import customer.Customer;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***************Welcome to ABC Bank Limited***************");
        Customer c1 = new Customer("Nilisha", "NILISHA05", "12345", 12, "987", "Dhanbad", "jaiswal.nilu@gmail.com",
                12345, 50);
        System.out.println("Select an option:\n1.Login(for old customers)\n2.Create a new account");
        int c = scan.nextInt();
        switch (c) {
            case 1:
                c1.login();
                break;
            case 2:
                System.out.println("Choose the account type:\n1.Savings\n2.Current");
                int ch = scan.nextInt();
                if (ch == 1) {
                    new Saving(new Random().nextLong());

                } else if (ch == 2) {
                    new Current(new Random().nextLong());

                } else
                    System.out.println("Invalid input");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
