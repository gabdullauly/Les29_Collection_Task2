/*
In the main class Main, create BankApplication object, add 5 new accounts each, with different balances.
And call all methods
 */

package Task4;

import com.sun.security.jgss.GSSUtil;

import javax.naming.PartialResultException;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Account account = new Account(111, "Aisana", "Princess", 456321.45);
        Account account1 = new Account(222, "Ainazar", "Tigr", 513543.56);
        Account account2 = new Account(333, "Sammy", "Mammy", 123545.11);
        Account account3 = new Account(444, "Jony", "Daddy", 984545.88);
        Account account4 = new Account(555, "Tanya", "GrandMa", 232156.71);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account4);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account1);
        BankApplication bankApplication = new BankApplication("Kaspi", accounts);

        System.out.println(bankApplication.getBankData());

        Account account5 = new Account(666, "Lionel", "Messi", 555666.44);
        bankApplication.addAccount(account5);

        System.out.println(bankApplication.getBankData());

        bankApplication.removeAccount(2);
        System.out.println(bankApplication.getBankData());

        System.out.println(bankApplication.getMaxAccount());

        System.out.println(bankApplication.getAverageBalance());

        System.out.println(bankApplication.getTotalBalance());

        System.out.println(bankApplication.totalAccounts());
    }
}
