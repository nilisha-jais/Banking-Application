package account;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter the type of account(Savings or Current):");
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        if (type.equals("saving")) {
            new Saving();
        } else
            new Current();
    }
}
