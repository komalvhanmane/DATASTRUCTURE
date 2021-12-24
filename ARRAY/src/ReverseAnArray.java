public class ReverseAnArray {
    //To Reverse an array
    //Lets take Example arr={1,2,3,4,5}
    //Expected Output arr={5,4,3,2,1}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        //Swapping the first and last term and then start++ and end-- and till start==end
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        //Now Print the Reversed array
        System.out.println("Reversed Array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //Thank you :)
    }
}
