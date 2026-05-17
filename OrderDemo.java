// Define an abstract class Order having members:
// id
// description

// Create two subclasses:

// PurchaseOrder
// SalesOrder

// Accept and display order details using abstract methods.


import java.util.Scanner;

// Abstract Class
abstract class Order {

    int id;
    String description;

    // Abstract Methods
    abstract void accept();

    abstract void display();
}

// Purchase Order Class
class PurchaseOrder extends Order {

    String customerName;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Purchase Order Details");

        System.out.print("Enter Order ID : ");
        id = sc.nextInt();

        System.out.print("Enter Description : ");
        description = sc.next();

        System.out.print("Enter Customer Name : ");
        customerName = sc.next();
    }

    void display() {

        System.out.println("\nPurchase Order Details");

        System.out.println("Order ID      : " + id);
        System.out.println("Description   : " + description);
        System.out.println("Customer Name : " + customerName);
    }
}

// Sales Order Class
class SalesOrder extends Order {

    String vendorName;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Sales Order Details");

        System.out.print("Enter Order ID : ");
        id = sc.nextInt();

        System.out.print("Enter Description : ");
        description = sc.next();

        System.out.print("Enter Vendor Name : ");
        vendorName = sc.next();
    }

    void display() {

        System.out.println("\nSales Order Details");

        System.out.println("Order ID    : " + id);
        System.out.println("Description : " + description);
        System.out.println("Vendor Name : " + vendorName);
    }
}

public class OrderDemo {

    public static void main(String args[]) {

        PurchaseOrder p = new PurchaseOrder();

        SalesOrder s = new SalesOrder();

        p.accept();

        s.accept();

        p.display();

        s.display();
    }
}