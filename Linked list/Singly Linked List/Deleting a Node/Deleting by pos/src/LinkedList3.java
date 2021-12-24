//Deleting the Node at the end

import java.util.Scanner;
public class LinkedList3 {
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
    public static void displayList(LinkedList3 lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList3 lst = new LinkedList3();
        lst.addFirst(4);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);
        System.out.println("Initial List :");
        displayList(lst);

        Node ptr= lst.head;
        Node prev=null;
        while(ptr.next!=null){
            prev=ptr;
            ptr=ptr.next;
        }
        assert prev != null;
        prev.next=null;
        System.out.println("List after deleting Node");
        displayList(lst);
    }
}
