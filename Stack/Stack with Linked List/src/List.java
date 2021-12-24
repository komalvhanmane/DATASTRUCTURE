import java.util.Scanner;

public class List {
    Node top;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        List lst=new List();
        public void push(int ele){
            Node temp=new Node(ele);
            if(lst.top==null){
                lst.top=temp;
            }
            else{
                temp.next=lst.top;
                lst.top=temp;
            }
            System.out.println("Pushed Successfully...");
        }
        public void pop(){
            if(lst.top==null){
                System.out.println("Stack Overflow");
            }
            else{
                Node temp= lst.top;
                System.out.println("Popped "+temp.data);
                lst.top=lst.top.next;
            }
        }
        public void display(){
            if(lst.top==null){
                System.out.println("List is empty");
            }
            else{
                Node temp=lst.top;
                int i=0;
                while(temp!=null){
                    System.out.println((i+1)+" Element is "+temp.data);
                    temp=temp.next;
                    i++;
                }
            }
        }

        public static void main(String[] args) {
            Stack st= new Stack();
            Scanner sc=new Scanner(System.in);
            do{
                System.out.println("Enter choice \n1-Push\n2-Pop\n3-Display\n4-Exit");
                switch (sc.nextInt()){
                    case 1:{
                        System.out.println("Enter the Elment you want to push");
                        int ele =sc.nextInt();
                        st.push(ele);
                        break;
                    }
                    case 2:{
                        st.pop();
                        break;
                    }
                    case 3:{
                        st.display();
                        break;
                    }
                    case 4:{
                        System.out.println("----------------Thank you------------");
                        System.exit(0);
                        break;
                    }
                }
                System.out.println("Enter 1 for contiuation");
            }while(sc.nextInt()==1);
        }
    }
}

