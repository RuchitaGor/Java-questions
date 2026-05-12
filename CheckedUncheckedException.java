// Program to demonstrate Checked and Unchecked Exceptions

import java.io.*;

public class CheckedUncheckedException {

    public static void main(String args[]) {

        // -----------------------------
        // Checked Exception Example
        // -----------------------------
        try {

            FileReader fr = new FileReader("abc.txt");

            System.out.println("File Opened Successfully");

        } catch(IOException e) {

            System.out.println("Checked Exception Occurred");
            System.out.println(e);
        }

        // -----------------------------
        // Unchecked Exception Example
        // -----------------------------
        try {

            int a = 10;
            int b = 0;

            int c = a / b;

            System.out.println(c);

        } catch(ArithmeticException e) {

            System.out.println("Unchecked Exception Occurred");
            System.out.println(e);
        }
    }
}
