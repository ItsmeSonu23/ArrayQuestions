import java.util.Scanner;
public class SmallestElement {

    public static int  smallestElement(int[] array) {
        int smallElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if(smallElement>array[i]){
                smallElement=array[i];
            }
        }

        return smallElement;
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

        // /Logic for SmallestElement
        int smallestElement = smallestElement(arr);
        System.out.println("Smallest element in array is " + smallestElement);
    }
}
