import java.util.Scanner;

public class Heap {
    //create insert delete
    int arr[];
    int size;
    Heap(){
        size=0;
        arr=new int[40];
    }
    //if 0-indexing is there then
    // parent at i-1/2 position
    // left child 2i+1 position
    // right child 2i+2 position

    //if 1-indexing is there then
    // parent at i/2 position
    // left child 2i position
    // right child 2i+1 position

    Scanner sc=new Scanner(System.in);
    public void create(){
        System.out.println("Enter the data :: ");
        int data=sc.nextInt();
        arr[++size]=data;
        arr[0]=size;
    }
    public void insert(){
        int parent,temp,i;
        do{
            if(size==0){
                create();
            }
            else{
                System.out.println("Enter the data ::");
                int data=sc.nextInt();
                arr[++size]=data;
                i=size;
                while (i>1){
                    parent=i/2;
                    if(arr[parent]<data){
                        temp=arr[parent];
                        arr[parent]=arr[i];
                        arr[i]=temp;
                        i=parent;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println("Do you want to continue adding elements press 1");
        }while (sc.nextInt()==1);
    }
    //display
    public void display(){
        for(int i=1;i<=size;i++){
            System.out.print(" "+arr[i]);
        }
    }



    void reHeap(int i){
       int l=0,r=0,max=0,temp;
       while (l<size && r<size){
           l=2*i;
           r=2*i+1;
           if(arr[l]>arr[r]){
               max=l;
           }
           else{
               max=r;
           }
           if(arr[i]<arr[max]){
               temp=arr[i];
               arr[i]=arr[max];
               arr[max]=temp;
               i=max;
           }
           else{
               return;
           }
       }
    }
    //delete
    public void delete(){
        System.out.println("Deleted element is ::"+arr[1]);
        arr[1]=arr[size];
        size--;
        reHeap(1);
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the choice \n1-create\n2-insert\n3-display\n4-delete");
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
                case 4:{
                    h.delete();
                    break;
                }
            }
            System.out.println("\nDo you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
