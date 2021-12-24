//deleting by value

import java.util.Scanner;

public class LinkedList {
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
    public void delete(int n){
        if(n==head.data){
            head=head.next;
        }
        else {
            Node ptr=head;
            Node prev = null;
            while(ptr.next!=null && n!=ptr.data){
                prev=ptr;
                ptr=ptr.next;
            }
            assert prev != null;
            prev.next=ptr.next;
        }
    }
    //display method
    public static void displayList(LinkedList lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList lst = new LinkedList();
        lst.addFirst(4);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(5);
        System.out.println("Initial List :");
        displayList(lst);

        System.out.println("Enter the value which you want to delete");
        int n=sc.nextInt();
        lst.delete(n);
        System.out.println(" List after deletion:");
        displayList(lst);
    }
}
