import java.util.Scanner;

public class Sorting {
    //bubble sort
    public static int[] bubbleSort(int []arr,int n){
        for(int i=0;i<arr.length;i++){
            System.out.println("\nPass "+(i+1));
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                System.out.println("\n inner pass of "+(i+1)+"."+j);
                for(int k=0;k<n;k++){
                    System.out.print(" |"+(k+1)+"|-->"+arr[k]);
                }
            }
            System.out.println("\nFinal Pass "+(i+1));
            for(int k=0;k<n;k++){
                System.out.print(" |"+(k+1)+"|-->"+arr[k]);
            }
        }
        return arr;
    }
    public static int[] selectionSort(int []arr,int n){
        for(int i=1;i<n-1;i++){
            if(arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            System.out.println("\nFinal Pass "+(i+1));
            for(int k=0;k<n;k++){
                System.out.print(" |"+(k+1)+"|-->"+arr[k]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements do you want in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted Array is : ");
        //arr=bubbleSort(arr,n);
        arr=selectionSort(arr,n);//Wrong code
    }
}
