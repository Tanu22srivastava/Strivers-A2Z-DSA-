import java.util.Scanner;
import java.util.*;
public class MergeSort {

    public static void mergeSort(int[]arr, int l, int h){
        if(l>=h) return;
        int mid= (l+h)/2;
        mergeSort(arr, l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }

    public static void merge(int[]arr, int l, int mid,int h){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=l;
        int right= mid+1;

        while(left<=mid && right<=h){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=h){
            temp.add(arr[right]);
            right++;
        }

        for(int i=l;i<=h;i++){
            arr[i]=temp.get(i-l);
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
        mergeSort(arr,0,n-1);
        System.out.println("After sorting: ");
        printArray(arr);

    }
}
