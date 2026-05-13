// Q2. Define a user defined exception “InsufficientFundException”. Create an Account class and 
// write a Java program to withdraw amount from account. 
// If balance is insufficient then throw InsufficientFundException.




import java.util.Scanner;

// User Defined Exception
class InsufficientFundException extends Exception {

    InsufficientFundException(String message) {

        super(message);
    }
}

public class InsufficientFundDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter Amount to Withdraw : ");

        double amount = sc.nextDouble();

        try {

            if(amount > balance) {

                double need = amount - balance;

                throw new InsufficientFundException ("Insufficient Balance. Need " + need + " more.");
            }
            else {

                balance = balance - amount;

                System.out.println("Withdrawal Successful");

                System.out.println("Remaining Balance : " + balance);
            }

        } catch(InsufficientFundException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}