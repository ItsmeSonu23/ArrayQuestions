import java.util.Scanner;

public class CheckSortedArray {

    public static boolean checkSorted(int array[]){
        boolean isSorted = true;
        for(int i = 0; i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();

        // Array initialized with size 
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }

        // Check the array is sorted or not
        boolean isSorted = checkSorted(arr);
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
