import java.util.Scanner;

public class CircularLinkedList1 {
    int data;
    CircularLinkedList1 left;
    CircularLinkedList1 right;
    CircularLinkedList1(int data){
        this.data=data;
        left=null;
        right=null;
    }
    static CircularLinkedList1 head=null;
    //Now insert
    public static void insert(int data){
        CircularLinkedList1 temp=new CircularLinkedList1(data);
        if(head==null){
            head=temp;
        }
        else{
            CircularLinkedList1 ptr=head;
            while(ptr.right!=null){
                ptr= ptr.right;
            }
            temp.left=ptr;
            ptr.right=temp;
        }
    }
    public static void display(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty");
        }
        else{
            CircularLinkedList1 ptr=head;
            while(ptr!=null){
                System.out.print("|"+ptr.data+"|->");
                ptr=ptr.right;
            }
        }
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
