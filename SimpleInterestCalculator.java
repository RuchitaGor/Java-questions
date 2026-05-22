import java.util.Scanner;

class SimpleInterestCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double p,r,t,si;

        System.out.println("Enter Principal Amount:");
        p = sc.nextDouble();

        System.out.println("Enter Rate:");
        r = sc.nextDouble();

        System.out.println("Enter Time:");
        t = sc.nextDouble();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);
    }
}
