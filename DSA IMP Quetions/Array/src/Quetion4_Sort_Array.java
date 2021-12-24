//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class Quetion4_Sort_Array {
    public static int[] sortWithoutNormalSort(int arr[]){
        int k0=0;
        int k1=0;
        int k2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                k0++;
            }
            else if(arr[i]==1){
                k1++;
            }
            else if(arr[i]==2){
                k2++;
            }
        }
        System.out.println(k0);
        System.out.println(k1);
        System.out.println(k2);
        for(int i=0;i<k0;i++){
            arr[i]=0;
        }
        for(int i=k0;i<k0+k1;i++){
            arr[i]=1;
        }
        for(int i=k1+k0;i<k0+k1+k2;i++){
            arr[i]=2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,0,0,2,1,1,0,0,2};
        int[] sortedArray=sortWithoutNormalSort(arr);
        System.out.println("Displaying Sorted is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
