import java.util.Scanner;

public class OccurenceOfDigit {
    public static int occurenceOfElement(int array[],int num){
        int occurence = 0;
        for (int i : array) {
            if(num == i){
                occurence++;
            }
        }
        return occurence;
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

        System.out.println("Enter the element to check occurence :");
        int num = scanner.nextInt();

        // logic

        int occurence = occurenceOfElement(arr,num);
        System.out.println("Occurence of "+num+" in array is "+ occurence);
    }
}
