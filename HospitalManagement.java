import java.util.Scanner;

class HospitalManagement
{
    String patientName;
    int patientId;
    String disease;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID:");
        patientId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Patient Name:");
        patientName = sc.nextLine();

        System.out.println("Enter Disease:");
        disease = sc.nextLine();
    }

    void display()
    {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
    }

    public static void main(String args[])
    {
        HospitalManagement h = new HospitalManagement();

        h.input();

        h.display();
    }
}
