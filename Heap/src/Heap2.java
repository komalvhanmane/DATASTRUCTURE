import java.util.Scanner;

public class Heap2 {
    int[]arr;
    int size;
    Heap2(){
        size=0;
        arr=new int[40];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(){
        do{
            System.out.println("Enter the data :: ");
            int data=sc.nextInt();
            if(size==0){
                arr[++size]=data;
            }
            else{
                arr[++size]=data;
                int parent;
                int i=size;
                while (i>0){
                    parent=i/2;
                    if(arr[i]>arr[parent]){
                        int temp=arr[i];
                        arr[i]=arr[parent];
                        arr[parent]=temp;
                        i=parent;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println("do you want to continue adding press 1");
        }while (sc.nextInt()==1);
    }
    void reheapify(int i) {
        int l=0,r=0,max=0,temp;
        while(l<size&&r<size)
        {
            l=2*i;
            r=(2*i)+1;
            if(arr[l]>arr[r])
            {
                max=l;
            }
            else
            {
                max=r;
            }
            if(arr[i]<arr[max])
            {
                temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
                i=max;
            }
            else
            {
                return;
            }

        }


    }
    void delete() {
        System.out.println("Deleted element is: "+arr[1]);
        int n=arr[size];
        int i=1;
        arr[i]=n;
        size--;

        reheapify(i);

    }
    void heapify(int n,int i) {
        int max=i;
        int l=2*i;
        int r=(2*i)+1;
        int temp=0;
        if(l<n && arr[l]>arr[max])
            max=l;
        if(r<n && arr[r]>arr[max])
            max=r;
        if(max!=i)
        {
            temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(n,max);
        }
    }
    void heapsort()
    {

        for(int p=size;p>=1;p--) {
            int temp=arr[1];
            arr[1]=arr[p];
            arr[p]=temp;
            heapify(p,1);
        }
    }
    public void display(){
        System.out.println("Displaying  : :");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Heap2 h=new Heap2();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter choice \n1-Create\n2-Display\n3-delete\n4-heapsort");
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
                case 4:{
                    h.heapsort();
                    break;
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
