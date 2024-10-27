import java.util.Scanner;

public class LargestElement {

    public static int largestElementInArray(int array[]) {
        int largetElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largetElement) {
                largetElement = array[i];
            }
        }
        return largetElement;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();

        // Array initialized with size 
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }

        // passing array into the function
        int largestElement = largestElementInArray(arr);
        System.out.println("Largest Element of Array is :"+ largestElement);

    }
}