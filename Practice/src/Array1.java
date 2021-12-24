import java.util.Scanner;

public class Array1 {
    Scanner sc=new Scanner(System.in);
    //Accept
    public int[] accept(){
        System.out.println("Enter the Total number of elements in an array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Element in an array at position "+(i+1));
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    //displaying the array
    public void display(int arr[]){
        System.out.println("--------------Displaying The Array--------------");
        for(int i=0;i<arr.length;i++){
            System.out.println("Elment at index "+(i+1)+" : "+arr[i]);
        }
    }
    //Reverse of an array
    public int[] reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Array1 a=new Array1();
        int arr[]=a.accept();
        a.display(arr);
        System.out.println("Reverse of Given Array : ");
        int arr1[]=a.reverse(arr);
        a.display(arr1);
    }
}
