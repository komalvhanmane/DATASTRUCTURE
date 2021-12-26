import java.util.Scanner;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left=null;
        right=null;
    }
}
class DoublylinkedList{
    Scanner sc=new Scanner(System.in);
    Node head=null;
    //Add at the end
    public void create(int element){
        Node temp=new Node(element);
        if(head==null){
            head=temp;
        }
        else{
            Node ptr=head;
            while (ptr.right!=null){
                ptr=ptr.right;
            }
            ptr.right=temp;
            temp.left=ptr;
        }
    }
    //Adding at the start
    public void insertAtInitial(int element){
        Node temp=new Node(element);
        if(head==null){
            head=temp;
        }
        else{
            temp.right=head;
            head.left=temp;
            head=temp;
        }
    }
    //insert at position
    public void insertAtmiddle(int element){
        System.out.println("Enter the position where you want to add");
        int pos=sc.nextInt();
        if(pos==1){
            insertAtInitial(element);
            return;
        }
        Node temp=new Node(element);
        Node ptr=head;
        Node prev=head;
        for(int i=0;i<pos-1;i++){
            prev=ptr;
            ptr=ptr.right;
        }
        prev.right=temp;
        temp.left=prev;
        temp.right=ptr;
        ptr.left=temp;
    }
    //Delete by element
    public void deleteByElement(int element){
        int index=search(element);
        if(index>=0){
            if(index==0){
                head=head.right;
                head.left=null;
            }
            else{
                Node ptr = head;
                Node prev = null;
                while (ptr.right != null && element != ptr.data) {
                    prev = ptr;
                    ptr = ptr.right;
                }
                assert prev != null;
                prev.right = ptr.right;
            }
        }
    }
    //Delete By Position
    public void deleteByposition(int pos){
        Node ptr=head;
        Node prev=head;
        for(int i=0;i<pos-1;i++){
            prev=ptr;
            ptr=ptr.right;
        }
        prev.right=ptr.right;
        prev.right.left=prev;
    }
    //search element
    public int search(int elemtn){
        int c=0;
        Node ptr=head;
        while (ptr!=null && ptr.data!=elemtn){
            ptr=ptr.right;
            ++c;
        }
        if(ptr==null){
            return -1;
        }
        else{
            return c;
        }
    }
    public void display(){
        Node ptr=head;
        while (ptr!=null){
            System.out.print("|"+System.identityHashCode (ptr.left)+"| "+ptr.data+" |"+System.identityHashCode (ptr.right)+"|<--->");
            ptr=ptr.right;
        }
    }

    public void reverse(){
        Node ptr=head;
        while (ptr.right!=null){
            ptr=ptr.right;
        }
        while (ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.left;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DoublylinkedList lst=new DoublylinkedList();
        System.out.println("-----------------------------------Doubly LinkedList----------------------------");
        do{
            System.out.println("Enter the choice \n1-Create/Insert at End\n2-Insert At First\n3-Insert At Mid\n4-Delete By Data\n5-Delete By Position\n6-Display\n7-Reverse");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Enter the Data :: ");
                    int data=sc.nextInt();
                    lst.create(data);
                    System.out.println("\nList after insertion :");
                    lst.display();
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("Enter the Data :: ");
                    int data=sc.nextInt();
                    lst.insertAtInitial(data);
                    System.out.println("\nList after insertion :");
                    lst.display();
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("Enter the Data :: ");
                    int data=sc.nextInt();
                    lst.insertAtmiddle(data);
                    System.out.println("\nList after insertion :");
                    lst.display();
                    System.out.println();
                    break;
                }
                case 4:{
                    System.out.println("Enter the Data :: ");
                    int data=sc.nextInt();
                    lst.deleteByElement(data);
                    System.out.println("\nList after deletion :");
                    lst.display();
                    System.out.println();
                    break;
                }
                case 5:{
                    System.out.println("Enter the Position :");
                    int pos=sc.nextInt();
                    lst.deleteByposition(pos);
                    System.out.println("\nList after deletion :");
                    lst.display();
                    System.out.println();
                    break;
                }
                case 6:{
                    lst.display();
                    break;
                }
                case 7:{
                    System.out.println("Reverse is :");
                    lst.reverse();
                    break;
                }
            }
            System.out.println("\nDo you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}