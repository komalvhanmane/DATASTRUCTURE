import java.util.Scanner;

public class Node {
    int data;
    Node link;

    public Node(int data){
        this.data=data;
        link=null;
    }
}
class linkedList{
    Scanner sc=new Scanner(System.in);
    Node head=null;
    public void insert(){
        do{
            System.out.println("Enter the Value : ");
            int value=sc.nextInt();
            Node temp=new Node(value);
            if(head==null){
                head=temp;
            }
            else{
                Node ptr=head;
                while (ptr.link!=null){
                    ptr=ptr.link;
                }
                ptr.link=temp;
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    public int length(){
        Node ptr=head;
        int c=0;
        while (ptr!=null){
            ptr=ptr.link;
            c++;
        }
        return c;
    }
    public void delete(){
        System.out.println("Enter the Node Number which you want to delete ");
        int nm=sc.nextInt();
        if(nm==1){
            head=head.link;
        }
        else{
            Node prev=head;
            Node ptr=head;

            for(int i=1;i<nm;i++){
                prev=ptr;
                ptr=ptr.link;
            }
            prev.link=ptr.link;
        }
    }
    public void deleteByNumber(){
        System.out.println("Enter the Number");
        int value=sc.nextInt();
        Node prev=head;
        Node ptr=head;
        while (ptr.data==value && ptr!=null){
            prev=ptr;
            ptr=ptr.link;
        }
        if(prev.data==value){
            prev.link=ptr.link;
        }
        else{
            System.out.println("Elment Not found ");
        }
    }
    public static void main(String[] args) {
        linkedList l=new linkedList();
        l.insert();
        l.display();
        int length=l.length();
        System.out.println("Length of the linked list is "+length);
        l.delete();
        l.display();
        l.deleteByNumber();
        l.display();
    }
}
