import java.util.Scanner;

class ATMSystem
{
    double balance = 5000;

    void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount)
    {
        balance = balance + amount;

        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;

            System.out.println("Amount Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ATMSystem atm = new ATMSystem();

        int choice;
        double amount;

        do
        {
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.println("Enter Choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter Amount:");
                    amount = sc.nextDouble();

                    atm.deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter Amount:");
                    amount = sc.nextDouble();

                    atm.withdraw(amount);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 4);
    }
}
