import java.util.Scanner;

class PrimeNumberChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n,flag=0;

        System.out.println("Enter Number:");
        n = sc.nextInt();

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
    }
}
