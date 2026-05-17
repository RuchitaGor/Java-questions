// Define a class Employee having method calculateSalary().

// Create two subclasses:

// TemporaryEmployee
// PermanentEmployee

// Calculate salary of temporary employee on hourly basis and permanent employee on daily basis using method overriding.


import java.util.Scanner;

class Employee {

    String name;

    Employee(String name) {

        this.name = name;
    }

    void calculateSalary() {

        System.out.println("Salary Calculation");
    }
}

// Temporary Employee Class
class TemporaryEmployee extends Employee {

    int hours;
    double ratePerHour;

    TemporaryEmployee(String name,
                      int hours,
                      double ratePerHour) {

        super(name);

        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    // Method Overriding
    void calculateSalary() {

        double salary = hours * ratePerHour;

        System.out.println("\nTemporary Employee Salary");
        System.out.println("----------------------------");

        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
}

// Permanent Employee Class
class PermanentEmployee extends Employee {

    int days;
    double ratePerDay;

    PermanentEmployee(String name,
                      int days,
                      double ratePerDay) {

        super(name);

        this.days = days;
        this.ratePerDay = ratePerDay;
    }

    // Method Overriding
    void calculateSalary() {

        double salary = days * ratePerDay;

        System.out.println("\nPermanent Employee Salary");
        System.out.println("----------------------------");

        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Temporary Employee
        System.out.print("Enter Temporary Employee Name : ");
        String tname = sc.next();

        System.out.print("Enter Working Hours : ");
        int hrs = sc.nextInt();

        System.out.print("Enter Rate Per Hour : ");
        double rph = sc.nextDouble();

        TemporaryEmployee t =
            new TemporaryEmployee(tname, hrs, rph);

        // Permanent Employee
        System.out.print("\nEnter Permanent Employee Name : ");
        String pname = sc.next();

        System.out.print("Enter Working Days : ");
        int days = sc.nextInt();

        System.out.print("Enter Rate Per Day : ");
        double rpd = sc.nextDouble();

        PermanentEmployee p =
            new PermanentEmployee(pname, days, rpd);

        // Display Salary
        t.calculateSalary();

        p.calculateSalary();

        sc.close();
    }
}