//Inserting at First Position and Middle Position and At the end

import java.util.Scanner;

public class LinkedListAllInsertion {
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
        Node temp=new Node(data);//created new node
        //connect the new node to 1st node
        temp.next=head;
        //then connect head to new node
        head=temp;
    }
    //Inserting Element at any position except first
    public void insert(int n,int data){
        //we need to traverse till the positions comes
        Node temp=new Node(data);
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
        Node temp=new Node(data);
        Node ptr;
        ptr=head;
        temp.next=null;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=temp;
    }
    //display method
    public static void displayList(LinkedListAllInsertion lst){
        Node temp=lst.head;
        while (temp!=null){
            System.out.print("|"+temp.data+"|"+System.identityHashCode (temp)+"|-> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Now connection
        LinkedListAllInsertion lst1=new LinkedListAllInsertion();
        do{
            System.out.println("Choice \n1-Insert at !st position\n2-Insert at Middle\n3-Insert at end\n4-Exit");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("enter the Element you want to insert at first position");
                    int n=sc.nextInt();
                    lst1.addFirst(n);
                    displayList(lst1);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Element which you want to insert and enter the position");
                    int n1=sc.nextInt();
                    int n=sc.nextInt();
                    lst1.insert(n,n1);
                    displayList(lst1);
                    break;
                }
                case 3:{
                    System.out.println("Enter the Element which you want to append");
                    int n=sc.nextInt();
                    lst1.append(n);
                    displayList(lst1);
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }
            System.out.println("Enter 1 for continuation ");
        }while (sc.nextInt()==1);
        System.out.println("-------------------thank you------------------");
    }
}
