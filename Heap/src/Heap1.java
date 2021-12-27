import java.util.Scanner;

public class Heap1 {
    //Array starts with 0
    /*if a node is at ith index
    * -> left child would be at 2i+1
    * -> right child would be 2i+2
    * Parent would be at =(I-1)/2*/

    //Array starts with 1
    /*if a node is at ith index
     * -> left child would be at 2i
     * -> right child would be 2i+1
     * Parent would be at =(I)/2*/

    //height of complete binary is logn
    int[]arr;
    int size;
    Heap1(){
        size=0;
        arr=new int[20];
    }
    Scanner sc=new Scanner(System.in);
    public void create(){
        System.out.println("Enter the data :: ");
        int data=sc.nextInt();
        arr[++size]=data;
    }

    public void insert(){
        int temp;
        int i,parent;
        do{
            if(size==0){
                create();
            }
            else{
                System.out.println("Enter the data :");
                int data=sc.nextInt();
                arr[++size]=data;
                i=size;
                while(i>1)
                {
                    parent=i/2;
                    if(arr[i]>arr[parent])
                    {
                        temp=arr[i];
                        arr[i]=arr[parent];
                        arr[parent]=temp;
                        i=parent;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            System.out.println("Do you want to continue adding element press 1");
        }while (sc.nextInt()==1);
    }
    public void display(){
        for(int i=1;i<=size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Heap1 h=new Heap1();
        do{
            System.out.println("Enter choice \n1-Create\n2-Insert\n3-Display");
            switch (sc.nextInt()){
                case 1:{
                    h.create();
                    break;
                }
                case 2:{
                    h.insert();
                    break;
                }
                case 3:{
                    h.display();
                    break;
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
