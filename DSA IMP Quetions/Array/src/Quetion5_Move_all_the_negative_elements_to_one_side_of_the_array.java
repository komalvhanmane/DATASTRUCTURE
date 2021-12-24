//Move all the negative elements to one side of the array
public class Quetion5_Move_all_the_negative_elements_to_one_side_of_the_array {
    public static int[] negative(int arr[]){
        int arr1[]=new int[arr.length];
        int k=0;
        //negative at one side
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr1[k]=arr[i];
                k++;
            }
        }
        //and remaining at one side
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr1[k]=arr[i];
                k++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        arr=negative(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
