import java.util.Scanner;

public class SecondSmallest {

    public static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmallest = arr[1];
        for(int i =0;i<arr.length; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest=arr[i];
            }else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
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

        // logic for second smallest element in an array
        int secondSmallest = secondSmallest(arr);
        System.out.println("Second smallest element in array is " + secondSmallest);
    }
}
