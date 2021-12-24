//Minimise the maximum difference between heights [V.IMP]
/*
Given an array arr[] denoting heights of N towers and a positive integer K,
 you have to modify the height of each tower either by increasing or decreasing them by K only once.
After modifying, height should be a non-negative integer.
Find out what could be the possible minimum difference of the height of
 shortest and longest towers after you have modified each tower.
A slight modification of the problem can be found here.

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as
{3, 3, 6, 8}. The difference between
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between
the largest and the smallest is 17-6 = 11.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n and k as input parameters and returns an integer denoting the minimum difference.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 104
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105
*/
public class Quetion9 {
    public static int min(int arr[]){
        int min=arr[0];
        int temp=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                temp=i;
                min=arr[i];
            }
        }
        return temp;
    }
    public static int max(int arr[]){
        int max=arr[0];
        int temp=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                temp=i;
                max=arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int k=3;
        int arr[]={3, 9, 12, 16, 20};
        int j=min(arr);
        arr[j]=arr[j]+k;
        for(int i=0;i< arr.length ;i++){
            if(i!=j){
                if(arr[i]-k<0){
                    arr[i]=arr[i]+k;
                }
                else{
                    arr[i]=arr[i]-k;
                }
            }
        }
        System.out.println("Modified Array ");
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int minIndex=min(arr);
        int maxIndex=max(arr);
        int height=arr[maxIndex]-arr[minIndex];
        System.out.println("\nDifference is "+height);
    }
}
