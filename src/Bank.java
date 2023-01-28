import java.util.Scanner;

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
                System.out.println("Enter the name: ");
                String name = scan.next();

                System.out.println("Enter the Username: ");
                String username = scan.next();

                System.out.println("Enter the password: ");
                String password = scan.next();

                System.out.println("Enter the age: ");
                int age = scan.nextInt();

                System.out.println("Enter the SSN: ");
                String ssn = scan.next();

                System.out.println("Enter the Address: ");
                String address = scan.next();

                System.out.println("Enter Email: ");
                String email = scan.next();

                System.out.println("Enter the phone Number: ");
                long phone = scan.nextLong();
                Customer c2 = new Customer(name, username, password, age, ssn, address, email, phone, 0);

                System.out.println("Profile Successfully created. Login using your credentials.");
                c2.login();
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
