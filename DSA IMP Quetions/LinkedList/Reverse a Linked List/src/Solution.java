//Time complexity O(n)

public class Solution {
    Node head;//head

    static class Node{
        int data;
        Node next;//address

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;
        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;
        return rest;
    }
    static Node reverseList(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        System.out.println("\nReversed List is :");
        Node ptr=head;
        while (ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Solution lst=new Solution();
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
        reverseList(lst.head);
        lst.head=reverse(lst.head);
    }
}
