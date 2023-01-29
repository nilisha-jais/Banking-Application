package customer;

import java.util.Scanner;

public class Customer implements Validation {
    Scanner scan = new Scanner(System.in);
    String name;
    String username;
    String password;
    int age;
    String ssn;
    String address;
    String email;
    long phone;
    float balance;

    public Customer() {
    }

    public Customer(String name, String username, String password, int age, String ssn, String address,
            String email, long phone, float balance) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public void login() {
        System.out.println("Enter username:");
        String username = scan.next();
        System.out.println("Enter password:");
        String password = scan.next();
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Login successfull!");
            this.displayMenu();
        } else {
            System.out.println("Try again");
            this.login();
        }
    }

    public void displayMenu() {
        System.out.println(
                "Please select an option:\n1. Deposit\n2. Withdrawal\n3. Check Balance\n4. Edit Profile\n5. Change Password \n6. Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount:");
                float sum = scan.nextFloat();
                deposit(sum);
                break;
            case 2:
                System.out.println("Enter the amount:");
                float amount = scan.nextFloat();
                withdrawal(amount);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                editProfile();
                break;
            case 5:
                System.out.println("Enter new password:");
                String psswrd = scan.next();
                changePassword(psswrd);
                break;
            case 6:
                System.out.println("Thank you for visiting us!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Do you want to continue(yes/no):");
        String temp = scan.next();
        if (temp.toLowerCase().equals("yes")) {
            displayMenu();
        } else
            System.exit(0);
    }

    public void deposit(float amount) {
        this.balance += amount;
        System.out.println(
                "Rupees " + amount + " successfully deposited. Your current balance is Rupees " + this.balance);
    }

    public void withdrawal(float amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out
                    .println("Rupees " + amount + " successfully withdrawan. Your current balance is " + this.balance);
        } else
            System.out.println("Insufficient balance in account.");
    }

    public void checkBalance() {
        System.out.println("Your account balance =" + balance);
    }

    public void editProfile() {
        System.out.println("Choose what you want to edit:\n1. Address\n2. Phone");
        int choice1 = scan.nextInt();
        if (choice1 == 1) {
            System.out.println("Enter new address:");
            String address = scan.next();
            this.address = address;
            System.out.println("Address Updated!");
        } else if (choice1 == 2) {
            System.out.println("Enter new phone number:");
            long phone = scan.nextLong();
            this.phone = phone;
            System.out.println("Phone number updated");
        } else
            System.out.println("Invalid input");
    }

    public void changePassword(String password) {
        this.password = password;
        System.out.println("Password updated. New password is " + this.password);
    }

    public void validateAge(int age) {
        if (age < 18) {
            System.out.println(
                    "You are not allowed to open an account. Enter a valid age which is greater than or equal to 18.");
            System.out.println("Do you want to restart(yes/no):");
            String ch1 = scan.next();
            if (ch1.toLowerCase().equals("yes")) {
                openAccount();
            } else {
                System.out.println("Thank you for visiting!");
                System.exit(0);
            }

        }
    }

    public void validateSSN(String ssn) {
        if (ssn.length() < 9 || ssn.length() > 9) {
            System.out.println("Invalid SSN number. Enter a SSN number of length 9");
            System.out.println("Do you want to restart(yes/no):");
            String ch2 = scan.next();
            if (ch2.toLowerCase().equals("yes")) {
                openAccount();
            } else {
                System.out.println("Thank you for visiting!");
                System.exit(0);
            }
        }
    }

    public void openAccount() {
        System.out.println("Enter the name: ");
        String name = scan.next();

        System.out.println("Enter the Username: ");
        String username = scan.next();

        System.out.println("Enter the password: ");
        String password = scan.next();

        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        validateAge(age);

        System.out.println("Enter the SSN: ");
        String ssn = scan.next();
        validateSSN(ssn);

        System.out.println("Enter the Address: ");
        String address = scan.next();

        System.out.println("Enter Email: ");
        String email = scan.next();

        System.out.println("Enter the phone Number: ");
        long phone = scan.nextLong();

        Customer c2 = new Customer(name, username, password, age, ssn, address, email, phone, 0);

        System.out.println("Profile Successfully created. Login using your credentials.");
        c2.login();
    }

}
