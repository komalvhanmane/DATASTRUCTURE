import java.util.Scanner;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }
}
class LinkedList11{
    Scanner sc=new Scanner(System.in);
    Node head=null;
    //insert at end
    public void create(){
        do{
            System.out.println("Enter the data : ");
            int d=sc.nextInt();
            Node temp=new Node(d);
            if(head==null){
                head=temp;
            }
            else{
                Node ptr=head;
                while (ptr.next!=null){
                    ptr=ptr.next;
                }
                ptr.next=temp;
            }
            System.out.println("Do you want to continue adding element at last press 1");
        }while (sc.nextInt()==1);
    }
    public void insertAtFirst(){
        System.out.println("Enter the data : ");
        int d=sc.nextInt();
        Node temp=new Node(d);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }
    public void insertAtMiddle(){
        System.out.println("Enter the data : ");
        int d=sc.nextInt();
        Node temp=new Node(d);
        if(head==null){
            head=temp;
        }
        else{
            System.out.println("Enter the position where you have to insert");
            Node prev=head;
            Node ptr=head;
            int place=sc.nextInt();
            for(int i=0;i<place-1;i++){
                prev=ptr;
                ptr=ptr.next;
            }
            temp.next=prev.next;
            prev.next=temp;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        else{
            Node ptr=head;
            while (ptr!=null){
                System.out.print("|"+ptr.data+"|->");
                ptr=ptr.next;
            }
        }
    }
    public int search(int data){
        int c=-1;
        if(head.data==data){
            return 0;
        }
        Node ptr=head;
        while(ptr!=null && ptr.data!=data){
            ptr=ptr.next;
            ++c;
        }
        return c;
    }
    public void deleteByData(){
        System.out.println("Enter the data you want to delete");
        int dataa=sc.nextInt();
        int index=search(dataa);
        if (index == 0) {
            head=head.next;
        }
        if(index>0) {
            Node ptr = head;
            Node prev = null;
            while (ptr.next != null && dataa != ptr.data) {
                prev = ptr;
                ptr = ptr.next;
            }
            assert prev != null;
            prev.next = ptr.next;
        }
    }
    public int getSize(){
        Node ptr=head;
        int size=0;
        while (ptr!=null){
            ptr=ptr.next;
            size++;
        }
        return size;
    }
    public void deleteByIndex(){
        if(head==null){
            return;
        }
        System.out.println("Enter the index you want to delete");
        int index=sc.nextInt();
        if(index==1){
            head=head.next;
        }
        else if(index==getSize()){
            Node ptr=head;
            while (ptr.next.next!=null){
                ptr=ptr.next;
            }
            ptr.next=null;
        }
        else {
            Node prev=head;
            Node ptr=head;
            for(int i=0;i<index-1;i++){
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=ptr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList11 lst=new LinkedList11();
        do{
            System.out.println("Enter the choice \n1-Create/Insert at End\n2-Insert at Middle\n3-Insert at First\n4-Display List\n5-Delete By Position\n6-Delete by Data");
            switch (sc.nextInt()){
                case 1:{
                    lst.create();
                    break;
                }
                case 2:{
                    lst.insertAtMiddle();
                    break;
                }
                case 3:{
                    lst.insertAtFirst();
                    break;
                }
                case 4:{
                    lst.display();
                    break;
                }
                case 5:{
                    lst.deleteByIndex();
                    break;
                }
                case 6:{
                    lst.deleteByData();
                    break;
                }
            }
            System.out.println("\nDo you want to continue Press 1");
        }while (sc.nextInt()==1);
    }
}
