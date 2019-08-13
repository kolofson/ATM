package ATM;

import java.util.Scanner;

public class ATM_Methods {

    //create customers
    Customers cust_1 = new Customers("Dave",  "1234", 400);
    Customers cust_2 = new Customers("Kelly",  "1111", 1000);
    Customers cust_3 = new Customers("Steve",  "0000", 200);
    Customers cust_4 = new Customers("Maya",  "0907", 350);

    Customers customerList [] = {cust_1, cust_2, cust_3, cust_4};

    public void FindCustomer(String pin, Scanner s) {
        Customers sign_in_customer = null;
        for (Customers customer : customerList) {
            if (customer.pin.equals(pin)) {
                sign_in_customer = customer;
                break;
            } else {
                continue;
            }
        }

        System.out.println("Welcome " + sign_in_customer.name);
        System.out.println("\nYou have a balance of $" + sign_in_customer.GetBalance());

        OpenMenu(sign_in_customer, s);
    }

    public void OpenMenu(Customers customer, Scanner s) {
        //SIGN IN MENU
        System.out.println("Please choose an option: \n1. Deposit\n2. Withdraw\n3. Log out");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("How much would you like to deposit?");
            int dep$ = s.nextInt();
            Deposit(customer, dep$);
            System.out.println(customer.GetBalance());
            OpenMenu(customer, s);
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            int withdraw$ = s.nextInt();
            if (withdraw$ <= customer.balance) {
                Withdraw(customer, withdraw$);
                System.out.println(customer.GetBalance());
                OpenMenu(customer, s);
            } else {
                System.out.println("You don't have that much money");
            }
        } else if (choice == 3) {
            System.out.println("Thank you, come again");
        } else {
            System.out.println("Not a valid option\n\nLogged Out for Safety.");
        }
    }

    public void Deposit(Customers customer, int amount) {
        customer.Deposit(amount);
    }

    public void Withdraw(Customers customer, int amount) {
        customer.Withdraw(amount);
    }
}
