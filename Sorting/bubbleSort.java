import java.util.Scanner;
public class bubbleSort {

    public static void bubbleSort(int[] arr){
        int n= arr.length;
        int flag =0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
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
        bubbleSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);

    }
}

// Important Note for MCQ in Bubble Sort

// total number of Rounds in bubble sort is n-1

// Where n is the number of elements in the array.