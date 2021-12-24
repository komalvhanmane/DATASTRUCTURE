import java.util.Scanner;
//Time complexity of linear search is O(n)
//Best case :O(1) Worst case :O(n)
//Time Complexity of Binary Search is O(log n)
//Best case :
public class Searching {
    public static void linearSearch(int[] arr, int n, int ele){
        int i;
        for( i=0;i<n;i++){
            if(arr[i]==ele){
                System.out.println("Element successfully Found at position "+ (i+1));
                break;
            }
        }
        if(i==n){
            System.out.println("Element is not present in the array");
        }
    }
    //Sorted Array required
    public static void binarySearch(int[] arr, int n, int ele){
        int start=0;
        int end=n;
        while(n>0){
            int mid= (start+end)/2;
            if(arr[mid]==ele){
                System.out.println("Element Found at "+(mid+1));
                break;
            }
            else if(arr[mid]>ele){
                end=mid-1;
            }
            else if (arr[mid]<ele){
                start=mid+1;
            }
            n=n/2;
        }
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
        System.out.println("Enter the element to be searched");
        int ele=sc.nextInt();

        System.out.println("------------Linear Search Results---------------");
        linearSearch(arr,n,ele);
        System.out.println("------------Binary Search Results-------------");
        binarySearch(arr,n,ele);
    }
}
