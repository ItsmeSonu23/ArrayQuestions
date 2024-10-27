import java.util.Scanner;

public class SumOfArray {

    public static int sumOfArray(int array[]){
        int sum=0;
        for (int i : array) {
            sum+=i;
        }

        return sum;
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

        int sum = sumOfArray(arr);
        System.out.println("The Sum Of Elements of Array is :" + sum);
    }
}
