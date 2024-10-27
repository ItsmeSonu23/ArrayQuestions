import java.util.Scanner;

public class AlternatePosition {


    public static int[]  alternatePosition(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[j] = arr[i];
                j++;
            }
        }
        int[]  temp = new int[j];
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                temp[k] = result[i];
                k++;
            }
        }

        return temp;

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

        int[] result = alternatePosition(arr);
        for(int i : result){
            System.out.println(i);
        }
    }
}
