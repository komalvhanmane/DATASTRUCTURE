import java.util.Scanner;

public class DoublyLinkedList {
    int data;
    DoublyLinkedList left;
    DoublyLinkedList right;
    DoublyLinkedList(int data){
        this.data=data;
        left=null;
        right=null;
    }
    static DoublyLinkedList head=null;
    public static void insert(int elment){
        DoublyLinkedList temp=new DoublyLinkedList(elment);
        if(head==null){
            head=temp;
            head.right=head.right;
        }
        else{
            DoublyLinkedList ptr=head;
            while(ptr.right!=head){
                ptr=ptr.right;
            }
            ptr.right=temp;
            temp.right=head;
        }
    }
    public static void display(){
        DoublyLinkedList ptr=head;
        while(ptr.right!=head){
            System.out.println(ptr.data);
        }
        System.out.println(ptr.right.data);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the Element ");
            int ele=sc.nextInt();
            insert(ele);
            System.out.println(ele+"  pushed.....");
            System.out.println();
            System.out.println("Do you want to continue press 1");
        }while(sc.nextInt()==1);
        System.out.println("displaying the linked list");
        display();
    }
}
