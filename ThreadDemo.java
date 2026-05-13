// //Write a Java program using multithreading for the following:
// Print numbers divisible by 8 from 1 to 100.
// Print even numbers from 50 to 100.
// Print message "Java is Awesome" 10 times.

class DivisibleThread extends Thread {

    public void run() {

        System.out.println("Numbers Divisible By 8:");

        for(int i = 1; i <= 100; i++) {

            if(i % 8 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class EvenThread extends Thread {

    public void run() {

        System.out.println("\nEven Numbers From 50 To 100:");

        for(int i = 50; i <= 100; i++) {

            if(i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class MessageThread extends Thread {

    public void run() {

        System.out.println("\nMessage:");

        for(int i = 1; i <= 10; i++) {

            System.out.println("Java is Awesome");
        }
    }
}

public class ThreadDemo {

    public static void main(String args[]) {

        DivisibleThread t1 = new DivisibleThread();

        EvenThread t2 = new EvenThread();

        MessageThread t3 = new MessageThread();

        // Start Threads
        t1.start();

        t2.start();

        t3.start();
    }
}