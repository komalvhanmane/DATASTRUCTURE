//Deleting 1st Node

public class LinkedList1 {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void addFirst(int data){
        //Now we have to insert Node in the beginning
        Node temp=new Node(data);//created new node
        //connect the new node to 1st node
        temp.next=head;
        //then connect head to new node
        head=temp;
    }
    public void append(int data){
        Node temp=new Node(data);
        Node ptr;
        ptr=head;
        temp.next=null;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;
    }
    //display method
    public static void displayList(LinkedList1 lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 lst=new LinkedList1();
        lst.addFirst(4);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);

        displayList(lst);
        lst.head= lst.head.next;
        System.out.println("\nDeleted First Node");
        displayList(lst);
    }
}
