import java.util.Scanner;

class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n,rev=0,temp,remainder;

        System.out.println("Enter Number:");
        n = sc.nextInt();

        temp = n;

        while(n>0)
        {
            remainder = n % 10;

            rev = rev * 10 + remainder;

            n = n / 10;
        }

        if(temp == rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
