//Deleting whole List

public class Listdelete {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    //adding element at first position
    public void addFirst(int data){
        //Now we have to insert Node in the beginning
        Node temp= new Node(data);//created new node
        //connect the new node to 1st node
        temp.next=head;
        //then connect head to new node
        head=temp;
    }
    //Inserting Element at any position except first
    public void insert(int n,int data){
        //we need to traverse till the positions comes
        Node temp= new Node(data);
        Node prev = null;
        Node ptr;
        ptr= head;
        for(int i=0;i<n-1;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr;
        assert prev != null;
        prev.next=temp;
    }
    //Inserting element at the end of list that is append
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
    public static void displayList(Listdelete lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Listdelete l=new Listdelete();
        l.addFirst(3);
        l.append(4);
        l.append(5);
        System.out.println("List : ");
        displayList(l);
        //for deleting list make head as null
        l.head=null;
        System.out.println("\nList deleted successfully");
    }
}
