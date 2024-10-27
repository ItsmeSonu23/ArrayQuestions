import java.util.Scanner;

public class SecondLargest {

    public static int secondLargestElement(int array[]){
        int largest = array[0];
        int secondLarge = array[1];
        for(int i =0; i<array.length;i++){
            if(array[i]>largest){
                // this line must be written before largest array 
                secondLarge=largest;
                largest = array[i];
            }else if(array[i]> secondLarge && array[i]!=largest){
                secondLarge=array[i];
            }
        }
        return secondLarge;
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
        int secondLarge=secondLargestElement(arr);
        System.out.println("The second largets Element of array :"+secondLarge);
    }
}
