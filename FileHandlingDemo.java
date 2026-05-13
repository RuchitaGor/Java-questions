// Q5. Write a Java program to accept strings from user until user enters "Stop". Store the strings into a file and display the contents of the file.

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("data.txt");

        String str;

        while(true) {

            System.out.print("Enter String : ");

            str = sc.nextLine();

            if(str.equalsIgnoreCase("Stop")) {

                break;
            }

            fw.write(str + "\n");
        }

        fw.close();

        BufferedReader br = new BufferedReader(
                new FileReader("data.txt"));

        String line;

        System.out.println("\nContents of File:");

        while((line = br.readLine()) != null) {

            System.out.println(line);
        }

        br.close();

        sc.close();
    }
}
