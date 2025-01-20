package Arrays;

import java.util.Scanner;

public class LargestElement {

    public static  int largestElement(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

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
        System.out.println("Element is : " + largestElement(arr));
        

    }
}
