import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int array[]){
        for(int i = 0;  i < array.length/2; i++){
            int temp = array[i];
            array[i] =array[array.length-i-1];
            array[array.length-i-1] = temp;

        }

    }

    public static void reverseArrayTwo(int array[]){
        int temp[] = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            temp[temp.length-i-1] = array[i];
        }
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

        // Logic
        reverseArray(arr);
       
        // print array
        for(int val: arr){
            System.out.println(val);
        }

        // Second Approach
        reverseArrayTwo(arr);

        for(int val: arr){
            System.out.println(val);
        }

    }
}