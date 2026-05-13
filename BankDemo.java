// Q1. Write a Java program to create a class Bank with data members:
// Customer Number
// Customer Name
// Balance

// Perform following operations:

// Deposit amount
// Withdraw amount
// Display customer details

import java.util.Scanner;

class Bank {

    int custNo;
    String custName;
    double balance;

    // Constructor
    Bank(int custNo, String custName, double balance) {

        this.custNo = custNo;
        this.custName = custName;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount Deposited Successfully");
    }

    // Withdraw Method
    void withdraw(double amount) {

        if(balance >= amount) {

            balance = balance - amount;

            System.out.println("Amount Withdrawn Successfully");
        }
        else {

            System.out.println("Insufficient Balance");
        }
    }

    // Display Method
    void display() {

        System.out.println("\nCustomer Details");
        System.out.println("------------------------");

        System.out.println("Customer Number : " + custNo);
        System.out.println("Customer Name   : " + custName);
        System.out.println("Balance         : " + balance);
    }
}

public class BankDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Number : ");
        int no = sc.nextInt();

        System.out.print("Enter Customer Name : ");
        String name = sc.next();

        System.out.print("Enter Balance : ");
        double bal = sc.nextDouble();

        Bank b = new Bank(no, name, bal);

        System.out.print("Enter Deposit Amount : ");
        double dep = sc.nextDouble();

        b.deposit(dep);

        System.out.print("Enter Withdraw Amount : ");
        double wd = sc.nextDouble();

        b.withdraw(wd);

        b.display();

        sc.close();
    }
}