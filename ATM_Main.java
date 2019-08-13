package ATM;

import java.util.*;

public class ATM_Main {

    public static void main(String [] args) {

        ATM_Methods methods = new ATM_Methods();
        Scanner s = new Scanner(System.in);

        //ATM START
        System.out.println("ATM READY\n\nEnter pin:");
        String pin_entry = s.nextLine();

        //USER PIN
        if (pin_entry.length() == 4) {
            methods.FindCustomer(pin_entry, s);
        } else {
            System.out.println("4 Digit Pin Required");
        }
    }
}
