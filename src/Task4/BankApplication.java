/*
Create a BankApplication class with parameters:
- String name;
- ArrayList <Account> accounts;
+ void addAccount (Account a); // Adds a new Account object
+ void removeAccount (int i); // Removes the object from the list at index
+ Account getMaxAccount (); // Returns the Account object with the highest balance
+ double getAverageBalance (); // Returns the average user balance
+ double getTotalBalance (); // Returns the amount of users balance
+ int totalAccounts (); // Returns the number of users
+ String getBankData (); // Returns the bank name, number of accounts, balance amount and average balance value
 */

package Task4;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts;

    public BankApplication(){}
    public BankApplication(String name, ArrayList<Account> accounts){
        this.name = name;
        this.accounts = accounts;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(int index){
        accounts.remove(index);
    }

    public Account getMaxAccount(){
        double maxAccount = 0;
        Account account = new Account();
        for (int i=0; i< accounts.size(); i++){
            if (accounts.get(i).getBalance()>maxAccount){
                maxAccount = accounts.get(i).getBalance();
                account = accounts.get(i);
            }
        }
        return account;
    }

    public Double getAverageBalance(){
        double averageBalance = 0;
        for (int i=0; i< accounts.size(); i++){
            averageBalance = averageBalance + accounts.get(i).getBalance();
        }
        return averageBalance/ accounts.size();
    }

    public Double getTotalBalance(){
        Double averageBalance = 0.0;
        for (int i=0; i< accounts.size(); i++){
            averageBalance = averageBalance + accounts.get(i).getBalance();
        }
        return averageBalance;
    }

    public Integer totalAccounts (){
        return accounts.size();
    }

    public String getBankData(){
        String s = name+"\n";
        for (int i=0; i<accounts.size(); i++){
            s = s + accounts.get(i).toString()+"\n";
        }
        return s;
    }
}
