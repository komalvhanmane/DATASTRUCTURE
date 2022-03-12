import java.util.Scanner;
//why to use linkedList :- To avoid wastage of memory,dynamic memory allocation
public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head=null;

    //create insert at end
    public void insert(int element){
        Node temp=new Node(element);
        if(head==null){
            head=temp;
        }
        else{
            Node ptr=head;
            while (ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }

    //insert at first
    public void insertAtFirst(int element){
        Node temp=new Node(element);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    //insert at middle
    public void insertAtMiddle(int element,int pos){
        Node temp=new Node(element);
        if(pos==1){
            insertAtFirst(element);
        }
        else{
            Node prev=head;
            Node ptr=head;
            for(int i=0;i<pos-1;i++){
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=temp;
            temp.next=ptr;
        }
    }

    //Delete by position
    public void deleteByPosition(int pos){
        if(head==null){
            return;
        }
        if(pos==1){
            head=head.next;
        }
        else{
            Node prev=head;
            Node ptr=head;
            for(int i=0;i<pos-1;i++){
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=ptr.next;
        }
    }
    //delete by data
    public void deleteByData(int element){
        int pos=search(element);
        deleteByPosition(pos);
    }
    //search
    public  int search(int element){
        if(head==null){
            return -1;
        }
        Node ptr=head;
        int cnt=1;
        while (ptr!=null && ptr.data!=element){
            cnt++;
            ptr=ptr.next;
        }
        return cnt;
    }
    //display
    public void display(){
        Node ptr=head;
        while (ptr!=null){
            System.out.print("| "+ptr.data+" |"+System.identityHashCode(ptr.next)+"|-->");
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList lst=new LinkedList();
        do{
            System.out.println("Enter the choice \n1-Insert\n2-Display\n3-Insert At First\n4-Insert at Middle\n5-Delete By data\n6-Delete By Position");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Enter the data::");
                    int data=sc.nextInt();
                    lst.insert(data);
                    System.out.println("List after insertion :: ");
                    lst.display();
                    break;
                }
                case 2:{
                    lst.display();
                    break;
                }
                case 3:{
                    System.out.println("Enter the data::");
                    int data=sc.nextInt();
                    lst.insertAtFirst(data);
                    System.out.println("List after insertion :: ");
                    lst.display();
                    break;
                }
                case 4:{
                    System.out.println("Enter the data::");
                    int data=sc.nextInt();
                    System.out.println("Enter the position :: ");
                    int pos=sc.nextInt();
                    lst.insertAtMiddle(data,pos);
                    System.out.println("List after Insertion");
                    lst.display();
                    break;
                }
                case 5:{
                    System.out.println("Enter the data::");
                    int data=sc.nextInt();
                    lst.deleteByData(data);
                    break;
                }
                case 6:{
                    System.out.println("Enter the position :: ");
                    int pos=sc.nextInt();
                    lst.deleteByPosition(pos);
                    System.out.println("List after deletion ::");
                    lst.display();
                    break;
                }
            }
            System.out.println("\nDo you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
