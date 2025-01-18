import java.util.*;
public class SelectionSort {

    public static void selectionSort(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int mini= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
                int temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
            }
            
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
        selectionSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);

    }
}
