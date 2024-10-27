import java.util.Scanner;

public class AppearOnce {

    public static int  singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result^=nums[i];
        }
        return result;
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

        //  logic for the numbers appeared once in an array than others
        int result = singleNumber(arr);
        System.out.println("The number appeared once in an array is " + result);
    }
}
