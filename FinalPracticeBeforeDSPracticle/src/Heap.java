import java.util.Scanner;

public class Heap {
    int arr[];
    int size;
    public Heap(){
        arr=new int[20];
        size=0;
    }
    Scanner sc=new Scanner(System.in);
    public void create(){
        System.out.println("Enter the data :: ");
        int data=sc.nextInt();
        arr[++size]=data;
        arr[0]=size;
    }
    public void insert(){
        do{
            if(size==0){
                create();
            }
            else{
                System.out.println("Enter the data :: ");
                int data=sc.nextInt();
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
            System.out.println("Do you want to continue adding nodes :: ");
        }while (sc.nextInt()==1);
    }

    //display
    public void display(){
        for(int i=1;i<=size;i++){
            System.out.println(arr[i]);
        }
    }
    public void heapify(int i){
        int left=0;
        int right=0;
        int max;
        while (left<=size && right<=size){
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
                return;
            }
        }
    }
    //delete
    public void delete(){
        System.out.println("Deleted element is "+arr[1]);
        arr[1]=arr[size];
        size--;
        heapify(1);
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.insert();
        h.display();
        h.delete();
        h.display();
        h.delete();
        h.display();
        h.delete();
        h.display();
    }
}
