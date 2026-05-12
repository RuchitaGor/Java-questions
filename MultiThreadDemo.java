// Q3. Write a Java program using multithreading for the following:
// Create one thread to print A to Z 50 times.
// Create second thread to print Fibonacci series up to 15 numbers.

class AlphabetThread extends Thread {

    public void run() {

        for(int i = 1; i <= 50; i++) {

            for(char ch = 'A'; ch <= 'Z'; ch++) {

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}

class FibonacciThread extends Thread {

    public void run() {

        int a = 0;
        int b = 1;
        int c;

        System.out.println("\nFibonacci Series:");

        for(int i = 1; i <= 15; i++) {

            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}

public class MultiThreadDemo {

    public static void main(String args[]) {

        AlphabetThread t1 = new AlphabetThread();

        FibonacciThread t2 = new FibonacciThread();

        // Start both threads
        t1.start();
        t2.start();
    }
}
