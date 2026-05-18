import java.util.Scanner;

class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        int total = 0;
        double percentage;

        System.out.println("Enter 5 subject marks:");

        for(int i=0;i<5;i++)
        {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 75)
        {
            System.out.println("Grade A");
        }
        else if(percentage >= 60)
        {
            System.out.println("Grade B");
        }
        else if(percentage >= 40)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
