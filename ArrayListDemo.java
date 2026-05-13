// Write a Java program to create an ArrayList of city names. Perform the following operations:
// Add city names into ArrayList.
// Display ArrayList.
// Remove all elements using clear() method.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cityList = new ArrayList<String>();

        System.out.print("Enter Number of Cities : ");

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print("Enter City Name : ");

            cityList.add(sc.next());
        }

        // Display ArrayList
        System.out.println("\nCity Names : " + cityList);

        // Remove all elements
        cityList.clear();

        System.out.println("After clear() : " + cityList);

        sc.close();
    }
}
