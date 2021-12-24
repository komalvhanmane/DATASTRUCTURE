//inserting Node At Mid or Any position

import java.util.Scanner;
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
    public static void displayList(LinkedList2 lst){
        Node temp=lst.head;
        int k=0;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+k+"|->");
            k++;
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*-----------------------------------------------------
         lst.head  second   third
            |       |        |
           |1|     |2|      |3|
        * create node |5|->temp
        * after inserting element in the beginning
        * |5|->|1|->|2|->|3|
        * */
        LinkedList2 lst=new LinkedList2();
        lst.head=new Node(1);
        Node second=new Node(2);
        Node thrd=new Node(3);

        //Now connection

        lst.head.next=second;
        second.next=thrd;
        System.out.println("Initial List :");
        displayList(lst);

        //Now we have to insert Node in the 2nd positon
        Node temp=new Node(5);//created new node

        //we need to traverse till the positions comes
        Node prev = null;
        Node ptr;
        ptr= lst.head;
        System.out.println("\nEnter the Position at which you want to insert");
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr;
        assert prev != null;
        prev.next=temp;

        System.out.println("\nList after Inserting :");
        //displaying list
        displayList(lst);
    }
}
