import java.util.Scanner;

class FactorialUsingRecursion
{
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter Number:");
        n = sc.nextInt();

        FactorialUsingRecursion f = new FactorialUsingRecursion();

        System.out.println("Factorial: " + f.fact(n));
    }
}
