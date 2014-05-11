import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/9/14
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    private ArrayList<AccountListener> listeners;
    private double balance;

    public Account(double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Negative amount specified");
        }
        this.balance = balance;
        listeners = new ArrayList<AccountListener>();
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount){
        if(balance < amount || amount < 0){
            throw new IllegalArgumentException("Illagal argument amount: " + amount);
        }
        double oldvalue = balance;
        balance -= amount;
        for (AccountListener al : listeners){
            al.fireBalanceChanged(oldvalue, this.balance);
        }
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Negative amount specified");
        }
        double oldvalue = balance;
        balance += amount;
        for (AccountListener al : listeners){
            al.fireBalanceChanged(oldvalue, this.balance);
        }
    }

    public void addListener(AccountListener al){
        if(!listeners.contains(al)) listeners.add(al);
    }

    public void removeListener(AccountListener al){
        listeners.remove(al);
    }

    @Override
    public String toString() {
        return "balance: " + this.balance;
    }

    public static void main(String[] args) {
        Account a =  new Account(5000);

        AccountFollower af1 = new AccountFollower();
        AccountFollower af2 = new AccountFollower();
        BankAdvisor ba1 = new BankAdvisor();

        a.addListener(af1);
        a.addListener(af2);
        a.addListener(ba1);

        a.withdraw(1000);
    }
}
