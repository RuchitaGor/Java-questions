// Define a class Staff having data members:
// Name
// Birth Date
// Designation
// Salary

// Accept details of 2 staff members and display the staff member having highest salary.

import java.util.Scanner;

class Staff {

    String name;
    String birthDate;
    String designation;
    double salary;

    // Constructor
    Staff(String name, String birthDate,
          String designation, double salary) {

        this.name = name;
        this.birthDate = birthDate;
        this.designation = designation;
        this.salary = salary;
    }

    // Display Method
    void display() {

        System.out.println("\nStaff Details");
        System.out.println("----------------------");

        System.out.println("Name        : " + name);
        System.out.println("Birth Date  : " + birthDate);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
    }
}

public class StaffDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Staff s[] = new Staff[2];

        // Accept details
        for(int i = 0; i < 2; i++) {

            System.out.println("\nEnter Details of Staff " + (i + 1));

            System.out.print("Enter Name : ");
            String name = sc.next();

            System.out.print("Enter Birth Date : ");
            String birth = sc.next();

            System.out.print("Enter Designation : ");
            String desig = sc.next();

            System.out.print("Enter Salary : ");
            double sal = sc.nextDouble();

            s[i] = new Staff(name, birth, desig, sal);
        }

        // Find highest salary
        if(s[0].salary > s[1].salary) {

            System.out.println("\nStaff Member Having Highest Salary:");

            s[0].display();
        }
        else {

            System.out.println("\nStaff Member Having Highest Salary:");

            s[1].display();
        }

        sc.close();
    }
}