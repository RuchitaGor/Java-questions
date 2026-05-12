import java.util.Scanner;

class Employee {

    int empNo;
    String empName;
    String designation;

    // Constructor of Employee class
    Employee(int empNo, String empName, String designation) {

        this.empNo = empNo;
        this.empName = empName;
        this.designation = designation;
    }
}

class Salary extends Employee {

    double basicSal;
    double netSalary;

    // Constructor of Salary class
    Salary(int empNo, String empName, String designation, double basicSal) {

        super(empNo, empName, designation);

        this.basicSal = basicSal;
    }

    // Method to calculate salary
    void calculateSalary() {

        double hra = 0.07 * basicSal;
        double da = 0.25 * basicSal;
        double tds = 0.10 * basicSal;
        double otherAllowance = 0.02 * basicSal;

        netSalary = basicSal + hra + da + otherAllowance - tds;
    }

    // Method to display employee details
    void display() {

        System.out.println("\nEmployee Details");
        System.out.println("---------------------------");

        System.out.println("Employee Number : " + empNo);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Designation     : " + designation);
        System.out.println("Basic Salary    : " + basicSal);
        System.out.println("Net Salary      : " + netSalary);
    }
}

public class EmployeeSalaryDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Salary emp[] = new Salary[5];

        // Accept details of 5 employees
        for(int i = 0; i < 5; i++) {

            System.out.println("\nEnter Details of Employee " + (i + 1));

            System.out.print("Enter Employee Number : ");
            int no = sc.nextInt();

            System.out.print("Enter Employee Name : ");
            String name = sc.next();

            System.out.print("Enter Designation : ");
            String desig = sc.next();

            System.out.print("Enter Basic Salary : ");
            double sal = sc.nextDouble();

            emp[i] = new Salary(no, name, desig, sal);

            emp[i].calculateSalary();
        }

        // Sorting according to highest net salary
        for(int i = 0; i < 5; i++) {

            for(int j = i + 1; j < 5; j++) {

                if(emp[i].netSalary < emp[j].netSalary) {

                    Salary temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }

        // Display top 2 employees
        System.out.println("\nTop Two Employees According To Highest Net Salary");

        emp[0].display();
        emp[1].display();

        sc.close();
    }
}
