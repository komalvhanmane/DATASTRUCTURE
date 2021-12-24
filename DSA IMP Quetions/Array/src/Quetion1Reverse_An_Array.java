//Reverse the array
public class Quetion1Reverse_An_Array {

    public static int[] reverse(int arr[]){
        int rev[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            rev[i]=arr[arr.length-i-1];
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,5,6,7};
        arr=reverse(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
