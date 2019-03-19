
import java.io.*;
import java.util.*;

public class BankAccount {

    static public double deposit(double balance) {
        balance = balance + 505.22;
        return balance;
    }

    static public double withdraw(double balance) {
        balance = balance - 100;
        return balance;
    }

    public static void main(String[] args) {

        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter Value of money:");
        double balance = kbReader.nextDouble();
        Scanner kReader = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = kReader.next();
        balance = deposit(balance);
        System.out.println("The amount of money left after depositing is " + balance);
        balance = withdraw(balance);
        System.out.println("The " + name + " account balance is " + balance);
    }
}