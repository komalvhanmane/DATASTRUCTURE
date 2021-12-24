import java.util.Scanner;

//Find the "Kth" max and min element of an array
public class Quetion3_Kth_Maximum_and_Minimum_Elment {
    //Kth Maximum Value
    public static int KthMaximum(int arr[],int k){
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length-k];
    }
    //Kth Minimum Vslue
    public static int KthMinimum(int arr[],int k){
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("Enter the Elements");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth Number of which Maximum you want");
        int k=sc.nextInt();
        int Max=KthMaximum(arr,k);
        System.out.println(k+"th Maximum Value in array is : "+Max);
        int Min=KthMinimum(arr,k);
        System.out.println(k+"th Minimum Value in array is : "+Min);
    }
}
