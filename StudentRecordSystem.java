import java.util.Scanner;

class StudentRecordSystem
{
    int rollNo;
    String name;
    double marks;

    void getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Marks:");
        marks = sc.nextDouble();
    }

    void display()
    {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String args[])
    {
        StudentRecordSystem s = new StudentRecordSystem();

        s.getData();

        s.display();
    }
}
