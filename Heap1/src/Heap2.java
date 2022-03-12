import java.util.Scanner;

public class Heap2 {
    int arr[];
    int maxsize;
    int size;

    public Heap2( int maxsize) {
        arr = new int[maxsize];
        this.maxsize = maxsize;
        size = 0;
    }

    Scanner sc=new Scanner(System.in);
    //create
    public void create(){
        System.out.println("Enter the data :: ");
        int data=sc.nextInt();
        arr[++size]=data;
        arr[0]=size;
    }

    //insert
    public void insert(){
        do{
            if(size==0){
                create();
            }
            else{
                System.out.println("Enter the data :: ");
                int data =sc.nextInt();
                arr[++size]=data;
                int i=size;
                while (i>1){
                    int parent = i/2;
                    if(arr[parent]<arr[i]){
                        int temp=arr[parent];
                        arr[parent]=arr[i];
                        arr[i]=temp;
                        i=parent;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
    public void display(){
        for(int i=1;i<=size;i++){
            System.out.println(arr[i]);
        }
    }
    void Heapify(int i){
        int left=0,right=0,max;
        while (left<maxsize && right<maxsize){
            left=2*i;
            right=2*i+1;
            if(arr[left]>arr[right]){
                max=left;
            }
            else{
                max=right;
            }
            if(arr[max]>arr[i]){
               int temp=arr[max];
               arr[max]=arr[i];
               arr[i]=temp;
               i=max;
            }
            else{
                break;
            }
        }
    }
    public void delete(){
        System.out.println("Deleted element is :: "+arr[1]);
        arr[1]=arr[size];
        size--;
        Heapify(1);
    }
    public static void main(String[] args) {
        Heap2 h=new Heap2(30);
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the choice \n1-insert\n2-display\n3-delete");
            switch (sc.nextInt()){
                case 1:{
                    h.insert();
                    break;
                }
                case 2:{
                    h.display();
                    break;
                }
                case 3:{
                    h.delete();
                    break;
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
