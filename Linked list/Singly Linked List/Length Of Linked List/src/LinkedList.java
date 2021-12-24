//length of linked list

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void addFirst(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }
    public void append(int data){
        Node temp=new Node(data);
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;
    }
    public static void display(LinkedList l){
        Node ptr=l.head;
        while(ptr!=null){
            System.out.println(" "+ptr.data);
            ptr=ptr.next;
        }
    }
    //this is by iteratively
    public static int getLength(LinkedList l){
        int i=0;
        Node ptr= l.head;
        while(ptr!=null){
            ptr=ptr.next;
            i++;
        }
        return i;
    }
    //this is by recursively
    public int getsize(Node n){
        if(n==null){
            return 0;
        }
        else{
            return 1+getsize(n.next);
        }
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addFirst(4);
        l.append(6);
        l.append(5);
        l.append(7);
        display(l);
        System.out.println("Length of the list is :"+getLength(l));
        System.out.println("Length of the list using recursion :"+l.getsize(l.head));
    }
}
