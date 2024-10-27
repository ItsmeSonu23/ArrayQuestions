import java.util.Scanner;

public class CountEvenOdd {

    public static void countEvenOdd(int[] arr){
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
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

        // logic for counting even odd in an array
        countEvenOdd(arr);

    }
}
