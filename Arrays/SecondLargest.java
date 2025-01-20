package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static  int SeclargestElement(int[] arr){
        int max= Integer.MIN_VALUE;
        int secMax= Integer.MIN_VALUE;
        if(arr.length <2) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secMax && arr[i]<max){
                secMax=arr[i];
            }
        }

        if(secMax==Integer.MIN_VALUE) return -1;    
        return secMax;

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
        System.out.println("Element is : " + SeclargestElement(arr));
        

    }
}
