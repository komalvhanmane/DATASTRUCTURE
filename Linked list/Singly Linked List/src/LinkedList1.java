import java.util.Scanner;

public class LinkedList1 {
    Node head;//head

    static class Node{
        int data;
        Node next;//address

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList1 lst=new LinkedList1();
        lst.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        //dynamically memory allocated for this value now we just have to join all this
        /*
        lst.head  second   third   fourth   fifth
            |       |        |        |       |
           |1|     |2|      |3|      |4|     |5|
           now we have to connect |1| to |2|
           then |2| to |3|
           then |3| to |4|
           .........
         */
        lst.head.next=second;//To connect 1st with second
        second.next=third;//to connect second with third
        third.next=fourth;//to connect third with fourth
        fourth.next=fifth;//to connect fourth with fifth
        System.out.println("Printing the List");

        Node temp = lst.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        int c=1;
    }
}
