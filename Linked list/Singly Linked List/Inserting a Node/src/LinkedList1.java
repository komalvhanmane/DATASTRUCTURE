//Inserting a Node in the beginning

public class LinkedList1 {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public static void displayList(LinkedList1 lst){
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
        LinkedList1 lst=new LinkedList1();
        lst.head=new Node(1);
        Node second=new Node(2);
        Node thrd=new Node(3);

        //Now connection

        lst.head.next=second;
        second.next=thrd;
        System.out.println("Initial List :");
        displayList(lst);
        System.out.println("\nList after Inserting :");

        //Now we have to insert Node in the beginning
        Node temp=new Node(5);//created new node
        //connect the new node to 1st node
        temp.next=lst.head;
        //then connect head to new node
        lst.head=temp;

        //displaying list
        displayList(lst);
    }
}
