import java.util.Scanner;

//deleting Node at mid position
public class LinkedList2 {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void addFirst(int data){
        //Now we have to insert Node in the beginning
        Node temp= new Node(data);//created new node
        //connect the new node to 1st node
        temp.next=head;
        //then connect head to new node
        head=temp;
    }
    public void append(int data){
        Node temp= new Node(data);
        Node ptr;
        ptr=head;
        temp.next=null;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;
    }
    //display method
    public static void displayList(LinkedList2 lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList2 lst=new LinkedList2();
        lst.addFirst(4);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);

        displayList(lst);
        Node ptr= lst.head;
        Node prev=null;
        System.out.println("\nEnter the Position where you want to delete");
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        assert prev != null;
        prev.next=ptr.next;

        System.out.println("\nList after Deleting Node");
        displayList(lst);
    }
}
