import java.util.*;
public class QuickSort {
    public static void quickSort(int[]arr,int low, int high){
        if(low<high){
            int pivot= findPivot(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int findPivot(int[]arr, int low, int high){
        int pivot= arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(pivot>=arr[i] && i<high) i++;
            while(pivot<arr[j] && j>low) j--;
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);

        return j;
    }

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        quickSort(arr,0,n-1);
        System.out.println("After sorting: ");
        printArray(arr);

    }
}
