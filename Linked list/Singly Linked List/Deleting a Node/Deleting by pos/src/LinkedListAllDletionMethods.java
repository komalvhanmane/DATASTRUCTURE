//Deletion at all methods

import java.util.Scanner;

public class LinkedListAllDletionMethods {
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
    //Delete first node
    public void deleteFirst(){
        head=head.next;
    }
    //Delete Mid node
    public void deletMid(int n){
        Node prev = null;
        Node ptr=head;
        for(int i=0;i<n-1;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        assert prev != null;
        prev.next=ptr.next;
    }
    //Delete Last Node
    public void deleteEnd(){
        Node prev = null;
        Node ptr=head;
        while(ptr.next!=null){
            prev=ptr;
            ptr=ptr.next;
        }
        assert prev != null;
        prev.next=null;
    }
    //display method
    public static void displayList(LinkedListAllDletionMethods lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListAllDletionMethods lst = new LinkedListAllDletionMethods();
        lst.addFirst(4);
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);
        System.out.println("Initial List :");
        displayList(lst);

        lst.deleteFirst();
        System.out.println("\nList after deleting First Node");
        displayList(lst);
        lst.deletMid(3);
        System.out.println("\nList after deleting "+"3rd"+" Node");
        displayList(lst);
        lst.deleteEnd();
        System.out.println("\nList after deleting last Node");
        displayList(lst);
    }
}
