import java.util.Scanner;
//Find the maximum and minimum element in an array

public class Quetion2Maximum_and_Minimum_Element_IN_Array {
    //Maximum number
    public static int maximum(int arr[]){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //Minimum number
    public static int minimum(int arr[]){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of element in array");
        int m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("Enter the Elements in array");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=maximum(arr);
        int min=minimum(arr);
        System.out.println("Maximum Element in array is "+max);
        System.out.println("Minimum Element in array is "+min);
    }
}
