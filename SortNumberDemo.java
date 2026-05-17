// Write a Java program to accept 5 numbers using command line arguments and display them in ascending order.


public class SortNumberDemo {

    public static void main(String args[]) {

        int arr[] = new int[5];

        // Accept command line arguments
        for(int i = 0; i < 5; i++) {

            arr[i] = Integer.parseInt(args[i]);
        }

        // Sorting in ascending order
        for(int i = 0; i < 5; i++) {

            for(int j = i + 1; j < 5; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted numbers
        System.out.println("Numbers In Ascending Order:");

        for(int i = 0; i < 5; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}