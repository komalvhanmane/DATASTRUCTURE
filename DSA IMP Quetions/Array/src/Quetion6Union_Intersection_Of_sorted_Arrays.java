public class Quetion6Union_Intersection_Of_sorted_Arrays {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        int B[]={3,4,5,7};
        int aSize=A.length;
        int bSize=B.length;
        int[] unionAUB =new int[aSize+bSize];
        int[] interAnB;
        if(aSize<bSize){
            interAnB=new int[aSize];
        }
        else {
            interAnB=new int[bSize];
        }
        int k=0,k1=0;
        for(k=0;k<aSize;k++){
            unionAUB[k]=A[k];
        }
        int i=0;
        for( i=0;i<bSize;i++){
            boolean b=false;
            for(int j=0;j<aSize;j++){
                if(B[i]!=A[j]){
                    b=true;
                }
                else{
                    b=false;
                    break;
                }
            }
            if(b){
                unionAUB[k]=B[i];
                k++;
            }
            else{
                interAnB[k1]=B[i];
                k1++;
            }
        }
        //displaying
        System.out.println("Union is :");
        for(i=0;i<k;i++){
            System.out.print(" "+unionAUB[i]);
        }
        System.out.println("\nIntersection is :");
        for(i=0;i<k1;i++){
            System.out.print(" "+interAnB[i]);
        }
    }
}
