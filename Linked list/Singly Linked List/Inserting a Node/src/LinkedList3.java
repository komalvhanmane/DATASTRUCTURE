//Inserting Element at the last of list

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
    public static void displayList(LinkedList3 lst){
        Node temp=lst.head;
        int k=0;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+k+"|->");
            k++;
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        /*-----------------------------------------------------
         lst.head  second   third
            |       |        |
           |1|     |2|      |3|
        * create node |5|->temp
        * after inserting element in the beginning
        * |5|->|1|->|2|->|3|
        * */
        LinkedList3 lst=new LinkedList3();
        lst.head=new Node(1);
        Node second=new Node(2);
        Node thrd=new Node(3);

        //Now connection

        lst.head.next=second;
        second.next=thrd;
        System.out.println("Initial List :");
        displayList(lst);

        Node temp=new Node(5);
        Node ptr;
        ptr=lst.head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;

        System.out.println("\nInserted List :");
        displayList(lst);
    }
}
