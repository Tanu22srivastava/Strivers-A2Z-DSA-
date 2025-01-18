import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n= arr.length;
        int temp, j;
        for(int i=0;i<n;i++){
            temp= arr[i];
            j=i;
            while(j>0 && arr[j-1]> temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
    }
    public static  void printArray(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        insertionSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);

    }
}
