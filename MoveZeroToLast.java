import java.util.Scanner;

public class MoveZeroToLast {

    public static void moveZeroToLast(int array[]){
        int index = 0;
        // movind non zero elements to the first
        for(int i = 0; i<array.length;i++){
            if(array[i]!=0){
                array[index] = array[i];
                index++;
            }
        }

        //moving zeros to the last element
        while(index<array.length){
            array[index] = 0;
            index++;
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

        // move zero to last of the array
        moveZeroToLast(arr);
        System.out.println("Array after moving zero to last");
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}
